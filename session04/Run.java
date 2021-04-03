import java.util.Scanner;

public class Main
{
    private int choice;
    private Scanner scanner;
    private String mainMeu;
    private String typeMenu;


    public Main()
    {
        mainMeu =
                """
                    1.new voting
                    2.results
                    3.show all voting
                        """;

        typeMenu =
                """
                        1.single vote
                        2.multiple vote
                        """;

        scanner = new Scanner(System.in).useDelimiter("\n");

    }


    public void printMainMenu()
    {
        System.out.println(mainMeu);

        userChoice();

        switch (choice)
        {
            case 1 -> new_voting();
            case 2 -> results();
        }
    }



    public void userChoice()
    {
        System.out.print("Your Choice : ");
        choice = scanner.nextInt();

    }


    public void new_voting()
    {
        System.out.print("Enter the question : ");
        String question = scanner.next();
        
        System.out.println("Enter the questions : ");
        System.out.println("(when it is finished enter \"finish\")");
        
        ArrayList<String>choices = new ArrayList<>();
        String choiceToAdd;
        while (true)
        {
            choiceToAdd = scanner.next();

            if (choiceToAdd.equals("finish"))
                break;

            choices.add(choiceToAdd);

        }

        System.out.println("Choose your type :");
        System.out.println(typeMenu);
        int type = scanner.nextInt() - 1;
        

    }


    public void results()
    {

    }





    public static void main(String[] args)
    {

        Main run = new Main();

        run.printMainMenu();

    }
}
