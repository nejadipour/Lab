//import ir.huri.jcal.*;

import java.util.ArrayList;

public class VotingSystem
{
    private ArrayList<Voting> votingList;


    public VotingSystem()
    {
        this.votingList = new ArrayList<>();

    }


    public void createVoting(String question, int type, ArrayList<String> choices)
    {
        Voting newVoting = new Voting(type, question);
        for (String choice : choices)
        {
            newVoting.createChoice(choice);

        }
        votingList.add(newVoting);


    }


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


    public void vote(int votingNum, Person person, ArrayList<String> choices)
    {
        votingList.get(votingNum).vote(person, choices);

    }


    public void printResults(int votingNum)
    {

    }


}
