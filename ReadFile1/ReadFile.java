import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of class ReadFile here.
 *
 * @author (Sahil Veeravalli)
 * @version (10/11/22)
 */
public class ReadFile
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class ReadFile
     */
    public ReadFile(String s)throws FileNotFoundException
    {
        File text = new File(s);
        Scanner scan = new Scanner(text);
        int cnt = 0;
        String line = "";
        String[] p;
        while (scan.hasNextLine())
        {
            line = scan.nextLine();
            p = line.split(" ");
            cnt = cnt + Integer.parseInt(p[1]);
        }
        System.out.println("The total is --->" + cnt);
}
}
