import java.awt.Color;

/**
 * Class BallDemo - a short demonstration showing animation with the 
 * Canvas class. 
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Heater 
{
    private int max;
    private int min;
    private int increment;
    private int current;
    private String temp;
    private Canvas myCanvas;

    /**
     * Create a BallDemo object. Creates a fresh canvas and makes it visible.
     */
    public Heater()
    {
        // initialise instance variables
        max = 100;
        min = 0;
        increment = 10;
        current = 50;
        myCanvas = new Canvas("Temperature Gauge", 500, 500);
        myCanvas.isVisible();
        draw(); 
    }

    /**
     * Simulate two bouncing balls
     */
    public void draw()
    {
        //int ground = 400;   // position of the ground line

        myCanvas.setVisible(true);

        // draw the ground
        temp = "" + current;
        myCanvas.erase();
        myCanvas.fillRectangle(260,250,100,100);
        myCanvas.setForegroundColor(Color.RED);
        myCanvas.drawString(temp,300,300);
        myCanvas.setForegroundColor(Color.BLACK);
        
        

        // create and show the balls
        

        // make them bounce
       
        }
         public void warmer()
    {
        if (current + increment > max)
        {
            myCanvas.drawString("Temperature too high",100,300);
        }
        else
        {
            current = current + increment;
            draw();
        }
    }
    public void cooler()
    {
        if (current - increment < min)
        {
            myCanvas.drawString("Temperature is too low",100,300);
        }
        else 
        {
            current = current - increment;
            draw();
        }
    }
     public void setIncrement(int increment)
    {
        this.increment = increment;
    }
    public Canvas getCanvas()
    {
        return myCanvas;
    }
    }
    

