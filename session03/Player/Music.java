/**
 * A class to hold details of each music
 *
 * @author Alireza Nejadipour
 * @version 2021.Mar.13
 */


public class Music
{
    private String name;
    private String genre;
    private String artist;
    private String address;
    private int year;

    public Music(String name, String genre, String artist, String address, int year)
    {
        this.name = name;
        this.genre = genre;
        this.artist = artist;
        this.address = address;
        this.year = year;
        
    }

    public void print()
    {

    }


    public int getYear()
    {
        return year;
    }

    public String getAddress()
    {
        return address;
    }

    public String getArtist()
    {
        return artist;
    }

    public String getGenre()
    {
        return genre;
    }

    public String getName()
    {
        return name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setArtist(String artist)
    {
        this.artist = artist;
    }

    public void setGenre(String genere)
    {
        this.genre = genere;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setYear(int year)
    {
        this.year = year;
    }
}
