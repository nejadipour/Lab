public class Person
{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;

    }


    @Override
    public String toString()
    {
        return "first name: " + getFirstName() + " | last name: " + getLastName();
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
}
