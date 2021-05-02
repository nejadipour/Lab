public class Person
{
    private String name;
    private String phoneNumber;
    private Ticket ticket;

    public Person(String name, String phoneNumber, Ticket ticket)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.ticket = ticket;

    }


    public void buyTicket(Ticket ticket) {
        this.ticket = ticket;
    }

}
