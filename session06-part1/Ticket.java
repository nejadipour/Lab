public class Ticket
{
    private Person person;
    private Film film;
    private Seat seat;
    private String date;

    public Ticket(Person person, Film film, Seat seat, String date)
    {
        this.person = person;
        this.film = film;
        this.seat = seat;
        this.date = date;

    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public String getDate() {
        return date;
    }

}
