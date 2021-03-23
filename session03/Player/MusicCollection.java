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


    public void addMusic()
    {
        
        
        

    }


    public void removeMusic()
    {
        System.out.println("Enter the address of music : ");
        String address;
        
        

    }



}
