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
                "3.Genres\n" +
                "4.Add music\n";

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
    }

    

}
