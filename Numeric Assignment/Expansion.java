
/**
 * This class expands the string
 *
 * @author (Sahil Veeravalli)
 * @version (9/18/2022)
 */
public class Expansion
{
    // instance variables - replace the example below with your own
    private String s;
    private String t;
    private String f;
    private int k;
    /**
     * Constructor
     */
    public Expansion()
    {
        // initialise instance variables
        this.s = s;
        t = "";
        f = "";
        k = 0;
    }
    //This method expands the string
    public void expand(String s)
    {        
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