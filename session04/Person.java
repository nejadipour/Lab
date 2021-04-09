/**
 * this class holds the details of each person
 * @version 1.2
 * @author Alireza Nejadipour
 */

public class Person
{
    private final String firstName;
    private final String lastName;

    /**
     * create a new person with given parameters
     * @param firstName the first name of the new person
     * @param lastName the last name of the new person
     */
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;

    }


    /**
     * method used to check if two persons are equal to each other or not
     * @param person the person that should be compared
     * @return id the same returns true, else returns false
     */
    public boolean equals(Person person)
    {
        return this.getFirstName().equals(person.getFirstName()) && this.getLastName().equals(person.getLastName());

    }


    /**
     * used to get the information of person in form of string
     * @return the information string
     */
    @Override
    public String toString()
    {
        return "first name: " + getFirstName() + " | last name: " + getLastName();

    }

    /**
     * gets the first name of the person
     * @return field firstName is returned
     */
    public String getFirstName()
    {
        return firstName;

    }

    /**
     * gets the lst name of the person
     * @return field lastName is returned
     */
    public String getLastName()
    {
        return lastName;

    }

}
