import java.util.Random;
/**
 * THis class samples random numbers
 *
 * @author (Sahil Veeravalli)
 * @version (10/13/22)
 */
public class My_Random
{
    public static void main(String[] args)//array
    {
        Random x = new Random();
        
        for (int i=0 ; i<10; i++)
        {
            System.out.println(x.nextInt(100) + 1); //sample from 1 - 100
        }
        System.out.println("Sample Numbers using Math Class"); 
        for (int i=0 ; i<10; i++)
        {
            System.out.println(((int)Math.random()*100)+1); //sample from 0 - 99
        }
    }
}
