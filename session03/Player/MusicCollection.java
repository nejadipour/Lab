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
    private String mainMenu;
    private String musicsMenu;
    private int choice;
    private Scanner scanner;

    public MusicCollection()
    {
        artists = new ArrayList<>();
        musics = new ArrayList<>();
        genres = new ArrayList<>();

        scanner = new Scanner(System.in);

        mainMenu =
                "1.Musics\n" +
                "2.Artists\n" +
                "3.Genres\n";
        
        musicsMenu =
                "1.Show musics\n" +
                "2.Add music\n" +
                "3.Remove music\n" +
                "4.Main menu\n";

    }


    public void userChoice()
    {
        System.out.print("Your Choice : ");
        choice = scanner.nextInt();

    }


    public void printManiMenu()
    {
        System.out.println(mainMenu);
        userChoice();
        
        switch (choice)
        {
            case 1:
                printMusicsMenu();
                break;
            case 2:
                break;
                
            case 3:
                break;
                
            case 4:
                break;
        }
    }
    
    
    public void printMusicsMenu()
    {
        System.out.println(musicsMenu);
        
        userChoice();
        
        switch (choice)
        {
            case 1:
                if(displayMusics())
                {
                    userChoice();
                    // TODO: 3/23/2021 play the music by its address 
                }
                else
                {
                    printMusicsMenu();
                }
                break;
                
            case 2:
                addMusic();
                printMusicsMenu();
                break;
                
            case 3:
                removeMusic();
                printManiMenu();
                break;
                
            case 4:
                printManiMenu();
                break;
                
        }
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
        
    }



}
