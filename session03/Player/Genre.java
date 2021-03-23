import java.util.ArrayList;

/**
 * A class to hold details of each genre
 *
 * @author Alireza Nejadipour
 * @version 2021.Mar.13
 */

public class Genre
{
    private String name;
    private ArrayList<Music> musics;
    private ArrayList<Artist> artists;

    public Genre(String name)
    {
        this.name = name;
        musics = new ArrayList<>();
        artists = new ArrayList<>();
    }


    public void addMusic(Music music)
    {
        if (findMusic(music.getName()) == null)
        {
            musics.add(music);
            System.out.println("Music added.");

        }
        else
        {
            System.out.println("Music is already available.");

        }

    }


    public Music findMusic(String name)
    {
        for (Music music : musics)
        {
            if (music.getName().equals(name))
            {
                return music;
            }

        }

        return null;
    }
    
    
    public void addArtist(Artist artist)
    {
        if (findArtist(artist.getName()) == null)
        {
            artists.add(artist);
            System.out.println("Artist added.");
            
        }
        
        else
        {
            System.out.println("Artist is available.");
        }
        
    }
    
    
    public Artist findArtist(String name)
    {
        for (Artist artist : artists)
        {
            if (artist.getName().equals(name))
            {
                return artist;
            }
            
        }
        
        return null;
    }

    public void print()
    {

    }
}
