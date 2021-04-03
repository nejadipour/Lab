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
        votingList.add(newVoting);

    }


    public void printVotingQuestions()
    {
        int votingNum = 1;
        for (Voting voting : votingList)
        {
            System.out.println("Voting " + votingNum + ":");
            System.out.println(voting.getQuestion());

            votingNum++;

        }

    }


    public void printVoting(int votingNum)
    {
        Voting voting = votingList.get(votingNum - 1);
        System.out.println(voting.getQuestion());

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
        

    }


    public void printResults(int votingNum)
    {

    }


}
