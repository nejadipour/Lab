import java.util.Scanner;

public class Run
{
    private String mainMenu;
    private String musicsMenu;
    private int choice;
    private Scanner scanner;
    private MusicCollection runtimeMusicCollection;

    public Run()
    {
        runtimeMusicCollection = new MusicCollection();

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
                if(runtimeMusicCollection.displayMusics())
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
                ;
                printMusicsMenu();
                break;

            case 3:
                runtimeMusicCollection.removeMusic();
                printManiMenu();
                break;

            case 4:
                printManiMenu();
                break;

        }
    }



}
