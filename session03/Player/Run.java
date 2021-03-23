
import java.util.Scanner;

public class Run
{
    private String mainMenu;
    private String musicsMenu;
    private String artistsMenu;
    private String genresMenu;
    private int choice;
    private Scanner scanner;
    public MusicCollection runtimeMusicCollection;

    public Run()
    {

        runtimeMusicCollection = new MusicCollection();

        scanner = new Scanner(System.in).useDelimiter("\n");


        mainMenu =
                "1.Musics\n" +
                "2.Artists\n" +
                "3.Genres\n" +
                "4.Exit\n";

        musicsMenu =
                "1.Show musics\n" +
                "2.Add music\n" +
                "3.Remove music\n" +
                "4.Main menu\n";

        artistsMenu =
                "1.Show artists\n" +
                "2.Add artist\n" +
                "3.Remove artist\n" +
                "4.Main menu\n";

        genresMenu =
                "1.Show generes\n" +
                "2.Add genre\n" +
                "3.Remove genre\n" +
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
                printArtistsMenu();
                break;

            case 3:
                prinGenresMenu();
                break;

            case 4:
                System.out.println("Hope U great music times!");
                System.exit(0);
                break;
        }

    }


    public void printMusicsMenu()
    {
        System.out.println(musicsMenu);

        userChoice();
        //E:\\Alireza\\aProgramming\\wav\\ahange shad.wav
        switch (choice)
        {
            case 1:
                if(runtimeMusicCollection.displayMusics())
                {
                    userChoice();

                    String address = runtimeMusicCollection.getMusics().get(choice - 1).getAddress();
                    if (Player.startPlay(address))
                    {
                        System.out.println("Music finished.");

                    }
                    else
                    {
                        System.out.println("Couldn't open the file.");

                    }
                    printManiMenu();

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


    public void addMusic()
    {
        System.out.print("Enter the name : ");
        String name = scanner.next();

        System.out.print("Enter the artist : ");
        String artistName = scanner.next();

        System.out.print("Enter the genre : ");
        String genre = scanner.next();

        System.out.print("Enter the address : ");
        String address = scanner.next();

        System.out.print("Enter the year : ");
        int year = scanner.nextInt();

        Music musicToAdd = new Music(name, genre, artistName, address, year);

        runtimeMusicCollection.addMusic(musicToAdd);

        // TODO: 3/23/2021 after adding music to musics list artists and genres should be updated too


    }


    public void removeMusic()
    {
        System.out.print("Enter the address : ");
        String address = scanner.next();

        runtimeMusicCollection.removeMusic(address);

        // TODO: 3/23/2021 when a music is removed artists and genres should be updated too

    }


    public void printArtistsMenu()
    {
        System.out.println(artistsMenu);

        userChoice();

        switch (choice)
        {
            case 1:
                if (runtimeMusicCollection.displayArtists())
                {
                    userChoice();
                    Artist artist = runtimeMusicCollection.getArtists().get(choice - 1);

                    if(artist.printMusics())
                    {
                        userChoice();

                        String address = runtimeMusicCollection.getMusics().get(choice - 1).getAddress();

                        if (Player.startPlay(address))
                        {
                            System.out.println("Music finished.");

                        }
                        else
                        {
                            System.out.println("Couldn't open the file.");

                        }

                    }
                    else
                    {
                        printArtistsMenu();

                    }

                }
                else
                {
                    printArtistsMenu();

                }
                break;

            case 2:
                addArtist();
                printArtistsMenu();
                break;

            case 3:
                removeArtist();
                printArtistsMenu();
                break;

            case 4:
                printManiMenu();
                break;
        }

    }


    public void addArtist()
    {
        System.out.print("Enter the name of artist : ");
        String name = scanner.next();

        Artist artistToAdd = new Artist(name);

        runtimeMusicCollection.addArtist(artistToAdd);

    }


    public void prinGenresMenu()
    {
        System.out.println(genresMenu);

        userChoice();

        switch (choice)
        {
            case 1:
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                printManiMenu();
                break;
        }

    }


    public void removeArtist()
    {
        System.out.print("Enter the name : ");
        String name = scanner.next();

        runtimeMusicCollection.removeArtist(name);

    }


    public static void main(String[] args)
    {
        Run run = new Run();

        run.printManiMenu();
    }






}
