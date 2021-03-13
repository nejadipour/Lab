/**
 * A class to hold details each music
 *
 * @author Alireza Nejadipour
 * @version 2021.Mar.13
 */


public class Music
{
    private String name;
    private String genere;
    private String artist;
    private String address;
    private int year;


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

    public String getGenere()
    {
        return genere;
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

    public void setGenere(String genere)
    {
        this.genere = genere;
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
