import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import ir.huri.jcal.JalaliCalendar;
import java.util.GregorianCalendar;

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
        this.listOfVotesToChoice = new HashMap<>();
        this.voters = new ArrayList<>();

    }


    /**
     * adds a new choice to the question
     * @param choice the choice that should be added
     */
    public void createChoice(String choice)
    {
        listOfVotesToChoice.put(choice, new HashSet<>());

    }


    public void vote(Person person, ArrayList<String> choices)
    {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        JalaliCalendar jalal = new JalaliCalendar(gregorianCalendar);

        voters.add(person);
        for (String choice : choices)
        {
            //listOfVotesToChoice.putIfAbsent(choice, new HashSet<>());
            Vote newVote = new Vote(person, jalal.toString());
            listOfVotesToChoice.get(choice).add(newVote);

        }

    }


    public boolean personExist(Person person)
    {
        for (Person personToCheck : voters)
        {
            if (personToCheck.equals(person))
            {
                return true;

            }

        }

        return false;

    }


    public ArrayList<Person> getVoters()
    {
        return voters;
    }

    public String getQuestion()
    {
        return question;
    }

    public ArrayList<String> getChoices()
    {
        return new ArrayList<>(listOfVotesToChoice.keySet());

    }

    public int getType()
    {
        return type;

    }

    public HashMap<String, HashSet<Vote>> getListOfVotesToChoice()
    {
        return listOfVotesToChoice;

    }
}
