
/**
 * Write a description of class Testclass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Testclass
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class Testclass
     */
    public Testclass()
    {
        Heater draw = new Heater();
        Canvas canvas = draw.getCanvas();
        for (int i = 0; i < 6; i++)
        {
            draw.warmer();
            canvas.wait(1000);
        }
        for (int i = 0; i < 12; i++)
        {
            draw.cooler();
            canvas.wait(1000);
        }
        draw.setIncrement(55);
        for (int i = 0; i < 4; i++)
        {
            draw.warmer();
            canvas.wait(1000);
        }
        for (int i = 0; i < 4; i++)
        {
            draw.cooler();
            canvas.wait(1000);
        }
       
    }

}
