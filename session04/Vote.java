/**
 * vote's information is stored in this class
 * @version 1.6
 * @author Alireza Nejadipour
 */

public class Vote
{
    private final Person person;
    private final String date;

    /**
     * create a new vote with passed parameters
     * @param person the person who has voted
     * @param date the date the vote is being added
     */
    public Vote(Person person, String date)
    {
        this.person = person;
        this.date = date;

    }


    /**
     * checks if two votes are equal or not
     * @param vote the vote that should be checked
     * @return if they are same returns true
     */
    public boolean equals(Vote vote)
    {
        return this.date.equals(vote.getDate()) && this.person.equals(vote.getPerson());

    }


    /**
     * gets the person who has voted
     * @return field person is returned
     */
    public Person getPerson()
    {
        return person;

    }

    /**
     * gets the date person has voted
     * @return field date is returned
     */
    public String getDate()
    {
        return date;

    }

}
