import java.util.*;

public class Main
{
    private int choice;
    private Scanner scanner;
    private String mainMeu;
    private String typeMenu;
    private String voteMenu;
    private VotingSystem runtimeSystem;


    public Main()
    {
        mainMeu =
                """
                    1.new voting
                    2.vote
                    3.results
                    4.exit
                        """;

        typeMenu =
                """
                        1.single vote
                        2.multiple vote
                        """;

        voteMenu =
                """
                        1.details
                        2.back
                        3.main menu
                        """;

        scanner = new Scanner(System.in).useDelimiter("\n");

        runtimeSystem = new VotingSystem();

    }


    public void printMainMenu()
    {
        System.out.println(mainMeu);

        userChoice();

        switch (choice)
        {
            case 1 -> newVoting();

            case 2 -> vote();

            case 3 -> results();

            case 4 -> System.exit(0);

            default -> System.out.println("Invalid input.");

        }

        printMainMenu();

    }



    public void userChoice()
    {
        System.out.print("Your Choice : ");
        choice = scanner.nextInt();

    }


    public void newVoting()
    {
        System.out.print("Enter the question : ");
        String question = scanner.next();

        System.out.println("Enter the questions : ");
        System.out.println("(when it is finished enter \"finish\")");

        ArrayList<String>choices = new ArrayList<>();
        String choiceToAdd;
        int choiceNum = 1;
        while (true)
        {
            System.out.print(choiceNum + ". ");
            choiceToAdd = scanner.next();

            if (choiceToAdd.equals("finish"))
                break;

            choices.add(choiceToAdd);

            choiceNum++;

        }

        System.out.println("Choose your type :");
        System.out.println(typeMenu);
        userChoice();

        runtimeSystem.createVoting(question, choice - 1, choices);

        System.out.println("voting added.");

    }


    public void vote()
    {
        if(runtimeSystem.printVotingQuestions())
        {
            userChoice();

            Voting voting = runtimeSystem.getVotingList().get(choice - 1);

            System.out.print("Enter your first name : ");
            String firstName = scanner.next();
            System.out.print("Enter your last name : ");
            String lastName = scanner.next();
            Person person = new Person(firstName, lastName);

            if (voting.personExist(person))
            {
                System.out.println("You have voted before.");
                return;

            }

            runtimeSystem.printVoting(choice);


            int type = voting.getType();
            ArrayList<String> choices = new ArrayList<>();


            if (type == 0)
            {
                System.out.print("Enter your choice(just one) : ");
                int singleChoice = scanner.nextInt();
                choices.add(voting.getChoices().get(singleChoice - 1));

            }
            else
            {
                System.out.println("Enter your choices(U can have more than one choice) : ");
                System.out.println("When it is finished enter \"finish\"");

                ArrayList<Integer> choicesArr = new ArrayList<>();

                while (true)
                {
                    System.out.print("Your choice : ");
                    String inp = scanner.next();

                    if (inp.equals("finish"))
                    {
                        break;

                    }
                    choicesArr.add(Integer.parseInt(inp));

                }

                for (int intChoice : choicesArr)
                {
                    choices.add(voting.getChoices().get(intChoice - 1));

                }

            }

            runtimeSystem.vote(choice - 1, person, choices);

        }

    }



    public void results()
    {
        if (runtimeSystem.printVotingQuestions())
        {
            userChoice();

            runtimeSystem.printResults(choice - 1);

            Voting voting = runtimeSystem.getVotingList().get(choice - 1);

            System.out.println(voteMenu);

            userChoice();

            switch (choice)
            {
                case 1 -> details(voting);

                case 2 -> results();

                default -> System.out.println("Invalid input.");

            }

        }

    }


    public void details(Voting voting)
    {
        System.out.println("voters :");
        ArrayList<Person> voters = voting.getVoters();

        for (Person person : voters)
        {
            System.out.println(person.toString());

        }
        System.out.println();

        System.out.println("Choices :");

        ArrayList<String> choices = voting.getChoices();

        HashMap<String, HashSet<Vote>> listOfVotesToChoice = voting.getListOfVotesToChoice();

        for (String choice : choices)
        {
            System.out.println("\"" + choice + "\"");
            HashSet<Vote> votes = listOfVotesToChoice.get(choice);

            for(Vote vote : votes)
            {
                System.out.println(vote.getPerson().toString() + " | date: " + vote.getDate());

            }

            System.out.println();

        }

    }





    public static void main(String[] args)
    {
        Main run = new Main();

        run.printMainMenu();

    }

}
