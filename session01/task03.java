import java.util.*;

public class task03
{
    public static void main(String args[])
    {
        //Scanner input = new Scanner(System.in);

        String myStr;
        //myStr = input.nextLine();

        myStr = args[0];

        for (char c : myStr.toCharArray())
        {
            System.out.println(c);
        }

    }

}
