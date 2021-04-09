import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import ir.huri.jcal.JalaliCalendar;
import java.util.GregorianCalendar;

/**
 * this class models a voting
 * it contains a question and choices
 * the votes will be stored here
 * @version 2.4
 * @author Alireza Nejadipour
 */

public class Voting
{
    // type shows if the vote is single(0) or multiple(1)
    private final int type;
    private final String question;
    private final ArrayList<Person> voters;
    private final HashMap<String, HashSet<Vote>> listOfVotesToChoice; // key: choice, value: vote

    /**
     * create a new voting
     * @param type it is single or multiple
     * @param question the question of the voting
     */
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


    /**
     * adds a new vote to the list
     * @param person who has voted!
     * @param choices which choices the voter has decided
     */
    public void vote(Person person, ArrayList<String> choices)
    {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        JalaliCalendar jalal = new JalaliCalendar(gregorianCalendar);

        voters.add(person);
        for (String choice : choices)
        {
            Vote newVote = new Vote(person, jalal.toString());
            listOfVotesToChoice.get(choice).add(newVote);

        }

    }


    /**
     * checks if the voter has voted before or not
     * @param person the person that should be checked
     * @return if it is new returns false
     */
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


    /**
     * gets list of voters of this voting
     * @return field voters is returned
     */
    public ArrayList<Person> getVoters()
    {
        return voters;

    }

    /**
     * gets the question of the voting
     * @return field question is returned
     */
    public String getQuestion()
    {
        return question;

    }

    /**
     * gets choices of the voting
     * @return field choices is returned
     */
    public ArrayList<String> getChoices()
    {
        return new ArrayList<>(listOfVotesToChoice.keySet());

    }

    /**
     * gets the type of voting
     * @return type field is returned
     */
    public int getType()
    {
        return type;

    }

    /**
     * gets list of choices with list of each choice's voters
     * @return listOfVotesToChoice is returned
     */
    public HashMap<String, HashSet<Vote>> getListOfVotesToChoice()
    {
        return listOfVotesToChoice;

    }
    
}
