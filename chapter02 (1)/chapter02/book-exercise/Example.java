/**
 * This class finds the maximum of three numbers
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Example
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int z;
    private String s;

    /**
     * Constructor for objects of class Example
     */
    public Example()
    {
        // initialise instance variables
        x = 34;
        y = 54;
        z = -19;
        //findMax();
        s = "abcdefghaaaaa";
        //playStrings();
        countLetter("a");
    }
    //This method finds the maximum number
    public void findMax(){
        if (x > y && x > z){
            System.out.println("x," + x + ",is the maximum number");}
        if (y > x && y > z){
            System.out.println("y," + y + ",is the maximum number");}
        if(z > x && z > z){
            System.out.println("z," + z + ",is the maximum number");}
    }
    //THIS METHOD ALLOWS US TO CHANGE VALUES OF VARIABLES
    public void setValue(int intx, int inty, int intz){
        intx = x;
        inty = y;
        intz = z;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getZ(){
        return y;
    }
    public void playStrings()
    {
        System.out.println("Length of string is " + s.length());
        String p = "";
        /**
        for(int i = 0; i < s.length(); i++)
        {
            p = "" + s.charAt(i);
            System.out.println("Character at position:" + i + "is" + p);
        }
        /**
        /**
        for(int i = 0; i < s.length(); i++)
        {
            p = "" + s.charAt(i);
            System.out.println("Substring:" + s.substring(i));
        }
        **/
    
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
        System.out.println("Number of times letter" + p + "occured is " + cnt);
    }
    }

