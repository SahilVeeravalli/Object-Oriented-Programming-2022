import java.util.ArrayList;

/**
 * Write a description of class Runs here.
 *
 * @author (Sahil Veeravalli)
 * @version (9/13)
 */
public class Runs
{
    // instance variables - replace the example below with your own
    private String s;
    

    /**
     * Constructor for objects of class Runs
     */
    public Runs(String s) //Takes an input from the user
    {
        this.s = s;
        countRuns();
    }
    public void countLetter(String p)
    {
        int cnt = 0;
        String t = "";
        for(int i = 0; i<s.length();i++)
        {
            t = "" + s.charAt(i);
            if (t.equals(p))
            {
                cnt = cnt + 1;
            }
        }
        System.out.println("Number of times letter" + p + "occurred is " + cnt);
    }
    public void countRuns()//method that prints runs
    {
        if(s.length() < 2) //Run has to be 2 or more letters in a row
        {
            System.out.println("no runs");
        }
        else
        {
            String let = "";
            String run = "";
            int cnt = 0;
            boolean areRuns = false;
            for(int i=0;i<s.length()-1; i++)
            {
                let = "" + s.substring(i, i+1); //compares one letter after the other
                run = "" + s.substring(i+1, i+2);
                if(let.equals(run))
                {
                    cnt++;
                }
                else if (cnt >= 2)//Will only print if the run is greater than or equal to 2 letters
                {
                    //cnt++;
                     
                    System.out.println("run of " + let + " of " + cnt);
                    cnt = 0;
                    areRuns = true;
                }
            }
            if (cnt >= 2)
            {
                
            }
            if(!areRuns)
            {
                System.out.println("no runs");
            }
        }
    }
    
    
}
