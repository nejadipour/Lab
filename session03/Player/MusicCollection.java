import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * A class to hold details of audio files.
 *
 * @author Alireza Nejadipour
 * @version 2021.Mar.13
 */

public class MusicCollection
{
    private ArrayList<Artist> artists;
    private ArrayList<Music> musics;
    private ArrayList<Genre> genres;


    public MusicCollection()
    {
        artists = new ArrayList<>();
        musics = new ArrayList<>();
        genres = new ArrayList<>();

    }


    public boolean displayMusics()
    {
        int musicNum = 1;

        if (musics.size() == 0)
        {
            System.out.println("No music found.");
            return false;

        }
        else
        {
            for (Music music : musics)
            {
                System.out.println("Music " + musicNum + ":");
                music.print();

            }

            return true;

        }
    }


    public void addMusic(Music music)
    {
        if (findMusic(music.getAddress()) == null)
        {
            musics.add(music);
            System.out.println("Music added.");

        }
        else
        {
            System.out.println("Music is already available.");

        }

    }


    public Music findMusic(String address)
    {
        for (Music music : musics)
        {
            if (music.getAddress().equals(address))
            {
                return music;

            }

        }

        return null;
    }


    public void removeMusic(String address)
    {
        Music musicToRemove = findMusic(address);

        if (musicToRemove == null)
        {
            System.out.println("Music is not available.");
        }
        else
        {
            musics.remove(musicToRemove);
            System.out.println("Music removed.");
        }

    }


    public boolean displayArtists(Artist artist)
    {
        int artistNum = 1;

        if (findArtist(artist.getName()) == null)
        {
            return false;
        }
        else
        {
            for(Artist artistToDisplay : artists)
            {
                System.out.println("Artist " + artistNum + ":");
                artistToDisplay.print();

            }

        }

        return true;

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
            System.out.println("Artist already exists.");
            
        }

    }


    public Artist findArtist(String name)
    {
        for(Artist artist : artists)
        {
            if(artist.getName().equals(name))
            {
                return artist;

            }
        }

        return null;

    }


    public void removeArtist(String name)
    {
        Artist artistToRemove = findArtist(name);
        
        if (artistToRemove == null)
        {
            System.out.println("Artist doesn't exist.");
            
        }
        else
        {
            artists.remove(artistToRemove);
            System.out.println("Artist removed.");
            
        }

    }

    public ArrayList<Artist> getArtists()
    {
        return artists;
    }

    public void setArtists(ArrayList<Artist> artists)
    {
        this.artists = artists;
    }

    public ArrayList<Music> getMusics()
    {
        return musics;
    }

    public void setMusics(ArrayList<Music> musics)
    {
        this.musics = musics;
    }

    public ArrayList<Genre> getGenres()
    {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres)
    {
        this.genres = genres;
    }
}
