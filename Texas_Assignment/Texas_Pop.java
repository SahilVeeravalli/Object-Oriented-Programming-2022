import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of class Texas_Pop here.
 *
 * @author (Sahil Veeravalli)
 * @version (10/13/22)
 */
public class Texas_Pop
{
    private Scanner scan;
    private Scanner sc;
    private String[] counties;
    private int[] population;
    private int[] numCon;
    private double[] percen;
    private double[] digitPop;
    private Random rand;
    private ArrayList<String>p;
    private String x;
    
    /**
     * Constructor for objects of class Texas_Pop
     */
    public Texas_Pop() throws FileNotFoundException
    {
        File text = new File("TexasCountyPopulation.txt");
        scan = new Scanner(text);
        sc = new Scanner(System.in);
        x = sc.nextLine();
        p = new ArrayList<String>();
        counties = new String[254];
        population = new int[254];
        numCon = new int[9];
        percen = new double[9];
        digitPop = new double[9];
        rand = new Random();
        
        
        System.out.println("1. Print the data from the file.");
        System.out.println("2. Find Texas total population ");
        System.out.println("3. Randomly choose a county and display its population ");
        System.out.println("4. Find counties population with a leading digit, entered by the user");
        System.out.println("5. Find total number of counties/percentage of population with each leading digit formatted");
        System.out.println("Input the number you'd like to perform: ");
        
        if(x == "1")
        {
            printData();
        }
        else if (x == "2")
        {
            Population();
        }
        else if (x == "3")
        {
            Population();
        }
        else if (x == "4")
        {
            Population();
        }
    }
    public void Population()
    {
        
    }
    public void populate()
    {
        
    }
    public int findTotal()
    {
        return(0);
    }
    public void printData()
    {
        
    }
    public void showLeadingDigit()
    {
        
    }
    public void randomCounty()
    {
        
    }
    public void analysis()
    {
        
    }
}
