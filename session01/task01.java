import java.util.*;


public class task01
{
    private int firstNum;
    private int secondNum;

    public task01()
    {
        firstNum = 2;
        secondNum = 2;
    }

    public boolean checkPrime()
    {
        for (int i = 2 ; i <= firstNum ; i++)
        {
            if (firstNum % i == 0)
            {
                if (secondNum % i == 0)
                {
                    return false;
                }

            }

        }

        return true;
    }



    public static void main(String args[])
    {
        task01 group = new task01();

        Scanner input = new Scanner(System.in);

        System.out.print("Give me the first number : ");

        group.firstNum = input.nextInt();

        System.out.print("Give me the second number : ");

        group.secondNum = input.nextInt();

        if (group.checkPrime())
        {
            System.out.println("Numbers are Prime to each other🤔");
        }
        else
        {
            System.out.println("Numbers are not Prime to each other🤔");
        }

    }

}
