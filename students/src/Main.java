import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner ss=new Scanner(System.in);
        Scanner si=new Scanner(System.in);
        System.out.println("How many Subjects");
        int su= si.nextInt();
        List subjectsList=new ArrayList<>();
        for(int i=0;i<=su;i++)
        {
            Formatter formatter=new Formatter();
            formatter.format("Sub% d",i);
            System.out.println("Sub id , Sub name");
            Subjects formatter;
            formatter = new Subjects(si.nextInt(), ss.nextLine());
            subjectsList.add(formatter);
        }
    }
}