import com.sun.source.tree.ArrayAccessTree;

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

            musicNum++;

            }

            return true;

        }
    }


    public boolean addMusic(Music music)
    {
        if (findMusic(music.getAddress()) == null)
        {
            musics.add(music);

            String artistName = music.getArtist();
            Artist artist = findArtist(artistName);
            if (artist == null)
            {
                artist = new Artist(artistName);
                artists.add(artist);
            }
            artist.addMusic(music);

            String genreName = music.getGenre();
            Genre genre = findGenre(genreName);
            if (genre == null)
            {
                genre = new Genre(genreName);
                genres.add(genre);
            }
            genre.addMusic(music);

            return true;


        }
        else
        {
            return false;

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


    public boolean removeMusic(String address)
    {
        System.out.println("here1");
        Music musicToRemove = findMusic(address);
        System.out.println("here3");

        if (musicToRemove == null)
        {
            return false;
        }
        else
        {
            System.out.println("here4");
            musics.remove(musicToRemove);
            System.out.println("here5");

            Artist artist = findArtist(musicToRemove.getArtist());
            System.out.println("here6");
            artist.removeMusic(musicToRemove);
            System.out.println("here7");

            Genre genre = findGenre(musicToRemove.getGenre());
            System.out.println("here8");
            genre.removeMusic(musicToRemove);
            System.out.println("here9");

            return true;

        }

    }


    public boolean displayArtists()
    {
        int artistNum = 1;

        if (artists.size() == 0)
        {
            System.out.println("No artist found.");
            return false;
        }
        else
        {
            for(Artist artist : artists)
            {
                System.out.println("Artist " + artistNum + ":");
                artist.print();

                artistNum++;

            }

        }

        return true;

    }


    public boolean addArtist(Artist artist)
    {
        if (findArtist(artist.getName()) == null)
        {
            artists.add(artist);
            return true;

        }
        else
        {
            return false;

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
            ArrayList<Music> musicsToRemove = artistToRemove.getMusics();

            while(musicsToRemove.size() != 0)
            {
                Music music = musicsToRemove.get(0);
                removeMusic(music.getAddress());
                musicsToRemove.remove(music);

            }

            artists.remove(artistToRemove);

            System.out.println("Artist removed.");

        }

    }


    public boolean displayGenres()
    {
        int genreNum = 1;

        if (genres.size() == 0)
        {
            System.out.println("No genre found.");
            return false;
        }
        else
        {
            for(Genre genre : genres)
            {
                System.out.println("Genre " + genreNum + ":");
                genre.print();

                genreNum++;

            }

        }

        return true;


    }


    public boolean addGenre(Genre genre)
    {
        if (findGenre(genre.getName()) == null)
        {
            genres.add(genre);
            return true;


        }
        else
        {
            return false;

        }

    }


    public Genre findGenre(String name)
    {
        for(Genre genre : genres)
        {
            if(genre.getName().equals(name))
            {
                return genre;

            }
        }

        return null;

    }


    public void removeGenre(String name)
    {
        Genre genreToRemove = findGenre(name);

        if (genreToRemove == null)
        {
            System.out.println("Genre doesn't exist.");

        }
        else
        {
            genres.remove(genreToRemove);
            System.out.println("Genre removed.");

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
