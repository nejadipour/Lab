import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * the system is running basically from here
 * @version 2.4
 * @author Alireza Nejadipour
 */

public class VotingSystem
{
    private final ArrayList<Voting> votingList;

    /**
     * create a new system
     */
    public VotingSystem()
    {
        this.votingList = new ArrayList<>();

    }


    /**
     * makes a new voting by given parameters
     * @param question the question of the new voting
     * @param type if it is single vote or multiple
     * @param choices the answers of the question
     */
    public void createVoting(String question, int type, ArrayList<String> choices)
    {
        Voting newVoting = new Voting(type, question);
        for (String choice : choices)
        {
            newVoting.createChoice(choice);

        }
        votingList.add(newVoting);

    }


    /**
     * prints all the questions
     * @return if no voting is available returns false
     */
    public boolean printVotingQuestions()
    {
        if (votingList.size() == 0)
        {
            System.out.println("No voting is available!");
            return false;

        }

        int votingNum = 1;
        for (Voting voting : votingList)
        {
            System.out.print("Voting " + votingNum + ":\t");
            System.out.println("\"" + voting.getQuestion() + "\"");

            votingNum++;

        }

        System.out.println();

        return true;

    }


    /**
     * gets the number of the voting and prints its info
     * @param votingNum the number of the voting
     */
    public void printVoting(int votingNum)
    {
        Voting voting = votingList.get(votingNum - 1);
        System.out.println("Question : " + voting.getQuestion());

        ArrayList<String> choices = voting.getChoices();

        int choiceNum = 1;

        for (String choice : choices)
        {
            System.out.print(choiceNum + ".");
            System.out.println(choice);

            choiceNum++;

        }

    }


    /**
     * gets the info needed to add a vote
     * @param votingNum which voting the vote should be added to!
     * @param person who has voted
     * @param choices which choices to vote
     */
    public void vote(int votingNum, Person person, ArrayList<String> choices)
    {
        votingList.get(votingNum).vote(person, choices);

    }


    /**
     * gets the number of voting and prints details of it
     * @param votingNum the number of voting
     */
    public void printResults(int votingNum)
    {
        Voting voting = votingList.get(votingNum);
        HashMap<String, HashSet<Vote>> listOfVotesToChoice = voting.getListOfVotesToChoice();

        for (String choice : voting.getChoices())
        {
            int size = listOfVotesToChoice.get(choice).size();

            System.out.println(size + " vote(s)" + "\t\t" + choice);

        }

        System.out.println();

    }

    /**
     * gets the list of all voting
     * @return votingList is returned
     */
    public ArrayList<Voting> getVotingList()
    {
        return votingList;

    }

}
