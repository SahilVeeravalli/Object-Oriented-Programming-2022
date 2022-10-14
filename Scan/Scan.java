import java.util.Scanner;
/**
 * This class implements a scanner to get use input from terminal window
 *
 * @author (Sahil Veeravalli)
 * @version (9/23/22)
 */
public class Scan
{
    // instance variables - replace the example below with your own
    private String s;
    private String t;
    private String f;
    private int k;
    private String x;
    Scanner scan;

    /**
     * Constructor for objects of class Scan
     */
    public Scan()
    {
        scan = new Scanner(System.in);
        int z = 4;
        int i = 0;
        this.s = s;
        t = "";
        f = "";
        k = 0;
        while(i < z)
        {
        System.out.println("Input a string: ");
        x = scan.nextLine();
        System.out.println("The input string is --> " + x);
        expand(x);
        i += 1;
    }
}
public void expand(String s)
    {        
        t = "";
        for (int i = 0; i < s.length(); i++) //runs through the string
        {
            if (Character.isDigit(s.charAt(i)))
            {
                k = Character.getNumericValue(s.charAt(i));
                if (i == (s.length()-1))
                {
                    t = t+"";
                }
                else if (Character.isDigit(s.charAt(i+1)))
                {
                    t=t+"";
                }
                else if (Character.isLetter(s.charAt(i+1)))
                {
                    f =""+s.charAt(i + 1);
                    for (int p = 0; p<k;p++)
                    {
                        t= t+f;
                    }
                }
                else
                {
                    t = t+"";
                }
            }
            else
            {
                t = t+s.charAt(i);
            }
        }
        System.out.println(t);
    }
}

