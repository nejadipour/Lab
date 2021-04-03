import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * this class models a voting
 * it contains a question and choices
 * the votes will be stored here
 */

public class Voting
{
    // type shows if the vote is single(0) or multiple(1)
    private int type;
    private String question;
    private ArrayList<Person> voters;
    private HashMap<String, HashSet<Vote>> listOfVotesToChoice; // key: choice, value: vote

    public Voting(int type, String question)
    {
        this.type = type;
        this.question = question;

    }


    /**
     * adds a new choice to the question
     * @param choice the choice that should be added
     */
    public void createChoice(String choice)
    {

    }


    public void vote(Person person, ArrayList<String> choices)
    {


    }


    public ArrayList<Person> getVoters()
    {
        return voters;
    }

    public String getQuestion()
    {
        return question;
    }

}
