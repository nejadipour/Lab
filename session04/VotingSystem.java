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

    }


    public void printVotingQuestions()
    {
        for (Voting voting : votingList)
        {
            System.out.println(voting.getQuestion());

        }

    }


    public void printVoting()
    {

    }


    public void vote(int votingNum, Person person, ArrayList<String> choices)
    {

    }


    public void printResults(int votingNum)
    {

    }


}
