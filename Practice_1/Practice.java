
/**
 * This class implements most of our vocabulary. 
 *
 * @author (Sahil Veeravalli)
 * @version (8/29/2022)
 */
public class Practice
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Practice
     */
    public Practice()
    {
        // initialise instance variables
        x = 0;
    }
    public Practice(int x1)
    {
        x = x1;
    }
    //this method displays value of x
    public void displayX()
    {
        System.out.println("The value of x is  -->" + getX());
    }
    //This method changes the value of x
    public void changeX(int y)
    {
        x = y;
    }
    //this method returns x
    public int getX()
    {
        return x;
    }
    //this method tells sign
    public void CheckX()
    {
        if (x>=0){
            System.out.println("x is positive");
        }
        else{
            System.out.println("x is negative");
        }
        }
    //This method displays ten consectutive values of x
    public void tenValue()
    {
        for (int i=x; i>x-10; i--)
        {
            System.out.println("The value x is" + i);
        }
        }
    }       

    
    
    
