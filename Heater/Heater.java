import java.awt.Canvas;

/**
 * Write a description of class Heater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private int max;
    private int min;
    private int increment;
    private int current;
    private Canvas myCanvas;
    

    /**
     * Constructor for objects of class Heater
     */
    public Heater()
    {
        // initialise instance variables
        max = 100;
        min = 0;
        increment = 10;
        current = 50;
        draw(); 
    }

    public void warmer()
    {
        if (current < 100)
        {
            current = current + increment;
        }
        else
        {
            System.out.println("The temperature is too high");
        }
    }
    public void cooler()
    {
        if (current > 50)
        {
            current = current - increment;
        }
        else 
        {
            System.out.println("current cannot go below 50");
        }
    }
    public void setIncrement(int increment)
    {
        this.increment = increment;
    }
    public void draw()
    {
        
    }
    public Canvas getCanvas()
    {
        return myCanvas;
    }
}
