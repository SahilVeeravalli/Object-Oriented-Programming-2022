
/**
 * This class tests the practice class.
 *
 * @author (Sahil Veeravalli)
 * @version (8/29/22)
 */
public class Test_Class
{
    // instance variables - replace the example below with your own
    private Practice x;
    private Practice y;

    /**
     * Constructor for objects of class Test_Class
     */
    public Test_Class()
    {
        x = new Practice();
        x.displayX();
        x.changeX(-500);
        x.displayX();
        y = new Practice(15);
    }
}
