import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Files
{
    public static void main(String[] args) throws IOException {
        try
        {
            File nf= new File("D:\\javap\\NewFile.txt");
            if (nf.exists())
            {
                FileWriter fw=new FileWriter("D:\\javap\\NewFile.txt");
                fw.write("hallo new text incoming:iiiii");
                fw.close();
                System.out.println("written");
            }

        }
        catch (Exception e)
        {
            System.out.println("File does not exist");
        }
        try
        {
            File nf= new File("D:\\javap\\NewFile.txt");
            if (nf.exists())
            {

                Scanner read= new Scanner(nf);
                while (read.hasNextLine())
                {
                    String data= read.nextLine();
                    System.out.println(data);
                }

            }
            else
            {
                System.out.println("file doesnt exist");
            }
        }
        catch (IOException e)
        {
            System.out.println("File does not exist");
        }
    }
}
