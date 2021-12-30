import java.util.Scanner;

public class NewPr
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("New world");
        String ss= sc.nextLine();
        System.out.println(ss);
        System.out.println("How many rows");
        int row= sc.nextInt();

        for (int i=0;i<row;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        try
        {
            int av= sc.nextInt();
            System.out.println(10/av);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide");
        }
        finally
        {
            System.out.println("Any other");
        }

    }
}