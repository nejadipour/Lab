public class Main
{
    private int choice;
    private Scanner scanner;
    public String mainMeu;
    
    
    public Main()
    {
        mainMeu =
                """
                1.new voting
                2.results
                3.show all voting
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
        
    }
    
    
    public void results()
    {
        
    }
    
    
    
    

    public static void main(String[] args)
    {


    }
}
