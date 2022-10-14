import java.util.ArrayList;
import java.util.Scanner; 
import java.util.Iterator;
/**
 * This class implements an array list and uses its methods. 
 *
 * @author (Sahil Veeravalli)
 * @version (9/27/22)
 */
public class Our_ArrayList
{
    // instance variables - replace the example below with your own
    private ArrayList <String> list1;
    private Scanner scan;

    /**
     * Constructor for objects of class Our_ArrayList
     */
    public Our_ArrayList()
    {
        Scanner scan = new Scanner(System.in);
        list1 = new ArrayList<String>();
        String s = "";
        for(int i = 0; i <5; i++)
        {
            System.out.println("Input a string -->");
            s = scan.nextLine();
            list1.add(s);
            
    
        }
        /**
        for(int i = 0; i < 5; i++)
        {
            System.out.println(list1.get(i));
        }
        
        //Use for each loop to access the elements of the array
        for (String p : list1)
        {
            System.out.println(p);
        }
        **/
        //use iterator
        Iterator it = list1.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
