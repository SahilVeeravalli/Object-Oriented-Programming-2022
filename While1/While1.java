
/**
 * Write a description of class While1 here.
 *
 * @author (Sahil Veeravalli)
 * @version (9/30/22)
 */
public class While1
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class While1
     */
    public While1()
    {
        // initialise instance variables
        
    }
    public void multiplesOfFive()
    {
        int i = 0;
        int x = 10;
        while (i<18)
        {
           System.out.println(x);
           x = x + 5;
           i++;
        }
    }
    public void sum()
    {
        int i = 0;
        int total = 0;
        while (i<10)
        {
            i +=1;
            total = total + i;
    
        }
        System.out.println(total);
    }
    public void sum(int a, int b)
    {
        int i = a;
        int total = 0;
        while (i <= b)
        {
            total = total + i;
            i++;
        }
        System.out.println(total);
    }
    public void isPrime(int n)
    {
        int i = 0;
        boolean prime = true;
        while (i <= n)
        {
            if (n%2 ==0)
            {
                prime = false;
            }
            else
            {
                prime = true;
            }
            i++;
        }
        System.out.println(prime);
    }
    public void findFirst(int n)
    {
        
    }
}
