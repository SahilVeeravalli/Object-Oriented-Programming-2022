import java.awt.Font;
import java.awt.Color;
/**
 * This is my quarter project, 2 rocketships are racing to the finish line
 * 
 * @author (Sahil Veeravalli) 
 * @version (10/4/2022)
 */
public class Anim
{
    // Creating a canvas
    Canvas canvas;
    //Creating my objects/shapes
    private Circle c3;
    private Rect s1;
    private Rect s2;
    private Rect s3;
    private Rect s4;
    private Rect f1;
    private Rect f2;
    private Circle c1;
    private Circle c2;
    
    
    
    /**
     * Constructor for objects of class Example
     */
    public Anim() throws InterruptedException
    {
        //This is the constructor for the animation, here I have set some text
        //and a wait time;
        canvas = Canvas.getCanvas();
        canvas.drawString("ROCKETSHIP RACE", 200,200);
        canvas.wait(2000);
        race();
    }
    
    public void race() throws InterruptedException
    {
        //These are where I am creating new objects from my rocketships
        Circle c3 = new Circle();
        Rect s1 = new Rect();
        Rect s2 = new Rect();
        Rect s3 = new Rect();
        Rect s4 = new Rect();
        Rect f1 = new Rect();
        Rect f2 = new Rect();
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        
        
        //Here the positions and colors are set
        
        //Circle color + position
        c3.visible();
        c3.changeColor("yellow");
        c3.moveHorizontal(63);
        c3.moveVertical(-95);
        c3.changeSize(115);
        
        //Rocketship body color + position
        s1.makeVisible();
        s1.changeColor("black");
        s1.moveHorizontal(30);
        s1.moveVertical(290);
        s1.changeSize1(25);
        s1.changeSize2(50);
        s2.makeVisible();
        s2.changeColor("black");
        s2.moveHorizontal(-200);
        s2.moveVertical(290);
        s2.changeSize1(25);
        s2.changeSize2(50);
        s3.makeVisible();
        s3.changeColor("black");
        s3.moveHorizontal(13);
        s3.moveVertical(300);
        s3.changeSize1(60);
        s3.changeSize2(8);
        s4.makeVisible();
        s4.changeColor("black");
        s4.moveHorizontal(-217);
        s4.moveVertical(300);
        s4.changeSize1(60);
        s4.changeSize2(8);
        
        //Fire from the rocketship color + position
        f1.makeVisible();
        f1.changeColor("red");
        f1.moveHorizontal(-195);
        f1.moveVertical(325);
        f1.changeSize1(15);
        f1.changeSize2(35);
        f2.makeVisible();
        f2.changeColor("red");
        f2.moveHorizontal(35);
        f2.moveVertical(325);
        f2.changeSize1(15);
        f2.changeSize2(35);
        
        c1.makeVisible();
        c1.changeColor("black");
        c1.moveHorizontal(109);
        c1.moveVertical(301);
        c1.changeSize(26);
        
        c2.makeVisible();
        c2.changeColor("black");
        c2.moveHorizontal(-121);
        c2.moveVertical(301);
        c2.changeSize(26);
        
        //These are my moving mechanisms for the animation
        //The rocketships go invisible and invisible while moving positions
        s1.makeInvisible();
        s3.makeInvisible();
        c1.visible();
        f2.makeInvisible();
        
        //The negative values represent the rocketships moving upward vertically
        s1.slowMoveVertical(-50);
        s3.slowMoveVertical(-50);
        c1.slowMoveVertical(-50);
        f2.slowMoveVertical(-50);
        
        s1.makeVisible();
        s3.makeVisible();
        c1.makeVisible();
        f2.makeVisible();
        
        //200 millisecond wait times between the movements 
        canvas.wait(200);
        
        s2.makeInvisible();
        s4.makeInvisible();
        c2.visible();
        f1.makeInvisible();
        
        s2.slowMoveVertical(-40);
        s4.slowMoveVertical(-40);
        c2.slowMoveVertical(-40);
        f1.slowMoveVertical(-40);
        
        canvas.wait(200);
        
        s2.makeVisible();
        s4.makeVisible();
        c2.makeVisible();
        f1.makeVisible();
        
        s1.makeInvisible();
        s3.makeInvisible();
        c1.visible();
        f2.makeInvisible();
        
        canvas.wait(200);
        
        s1.slowMoveVertical(-20);
        s3.slowMoveVertical(-20);
        c1.slowMoveVertical(-20);
        f2.slowMoveVertical(-20);
        
        s1.makeVisible();
        s3.makeVisible();
        c1.makeVisible();
        f2.makeVisible();
        
        canvas.wait(200);
        
        s2.makeInvisible();
        s4.makeInvisible();
        c2.visible();
        f1.makeInvisible();
        
        s2.slowMoveVertical(-60);
        s4.slowMoveVertical(-60);
        c2.slowMoveVertical(-60);
        f1.slowMoveVertical(-60);
        
        canvas.wait(200);
        
        s2.makeVisible();
        s4.makeVisible();
        c2.makeVisible();
        f1.makeVisible();
        
        s1.makeInvisible();
        s3.makeInvisible();
        c1.visible();
        f2.makeInvisible();
        
        canvas.wait(200);
        
        s1.slowMoveVertical(-30);
        s3.slowMoveVertical(-30);
        c1.slowMoveVertical(-30);
        f2.slowMoveVertical(-30);
        
        s1.makeVisible();
        s3.makeVisible();
        c1.makeVisible();
        f2.makeVisible();
        
        canvas.wait(200);
        
        s2.makeInvisible();
        s4.makeInvisible();
        c2.visible();
        f1.makeInvisible();
        
        s2.slowMoveVertical(-50);
        s4.slowMoveVertical(-50);
        c2.slowMoveVertical(-50);
        f1.slowMoveVertical(-50);
        
        s2.makeVisible();
        s4.makeVisible();
        c2.makeVisible();
        f1.makeVisible();
        
        
        s1.makeInvisible();
        s3.makeInvisible();
        c1.visible();
        f2.makeInvisible();
        
        s1.slowMoveVertical(-70);
        s3.slowMoveVertical(-70);
        c1.slowMoveVertical(-70);
        f2.slowMoveVertical(-70);
        
        s1.makeVisible();
        s3.makeVisible();
        c1.makeVisible();
        f2.makeVisible();
        
        canvas.wait(200);
        
        s2.makeInvisible();
        s4.makeInvisible();
        c2.visible();
        f1.makeInvisible();
        
        s2.slowMoveVertical(-80);
        s4.slowMoveVertical(-80);
        c2.slowMoveVertical(-80);
        f1.slowMoveVertical(-80);
        
        s2.makeVisible();
        s4.makeVisible();
        c2.makeVisible();
        f1.makeVisible();
        
        canvas.wait(200);
        
        s1.makeInvisible();
        s3.makeInvisible();
        c1.visible();
        f2.makeInvisible();
        
        s1.slowMoveVertical(-40);
        s3.slowMoveVertical(-40);
        c1.slowMoveVertical(-40);
        f2.slowMoveVertical(-40);
        
        s1.makeVisible();
        s3.makeVisible();
        c1.makeVisible();
        f2.makeVisible();
        
        canvas.wait(200);
        
        s2.makeInvisible();
        s4.makeInvisible();
        c2.visible();
        f1.makeInvisible();
        
        s2.slowMoveVertical(-60);
        s4.slowMoveVertical(-60);
        c2.slowMoveVertical(-60);
        f1.slowMoveVertical(-60);
        
        s2.makeVisible();
        s4.makeVisible();
        c2.makeVisible();
        f1.makeVisible();
        
        canvas.wait(200);
        
        s1.makeInvisible();
        s3.makeInvisible();
        c1.visible();
        f2.makeInvisible();
        
        s1.slowMoveVertical(-90);
        s3.slowMoveVertical(-90);
        c1.slowMoveVertical(-90);
        f2.slowMoveVertical(-90);
        
        canvas.wait(200);
        
        s1.makeVisible();
        s3.makeVisible();
        c1.makeVisible();
        f2.makeVisible();
        
        s2.makeInvisible();
        s4.makeInvisible();
        c2.visible();
        f1.makeInvisible();
        
        s2.slowMoveVertical(-20);
        s4.slowMoveVertical(-20);
        c2.slowMoveVertical(-20);
        f1.slowMoveVertical(-20);
        
        s2.makeVisible();
        s4.makeVisible();
        c2.makeVisible();
        f1.makeVisible();
        
        canvas.wait(200);
        
        s1.makeInvisible();
        s3.makeInvisible();
        c1.visible();
        f2.makeInvisible();
        
        s1.slowMoveVertical(-40);
        s3.slowMoveVertical(-40);
        c1.slowMoveVertical(-40);
        f2.slowMoveVertical(-40);
        
        s1.makeVisible();
        s3.makeVisible();
        c1.makeVisible();
        f2.makeVisible();
        
        canvas.wait(200);
        
        s2.makeInvisible();
        s4.makeInvisible();
        c2.visible();
        f1.makeInvisible();
        
        s2.slowMoveVertical(-30);
        s4.slowMoveVertical(-30);
        c2.slowMoveVertical(-30);
        f1.slowMoveVertical(-30);
        
        s2.makeVisible();
        s4.makeVisible();
        c2.makeVisible();
        f1.makeVisible();
        
        canvas.wait(200);
        
        s1.makeInvisible();
        s3.makeInvisible();
        c1.visible();
        f2.makeInvisible();
        
        s1.slowMoveVertical(-40);
        s3.slowMoveVertical(-40);
        c1.slowMoveVertical(-40);
        f2.slowMoveVertical(-40);
        
        s1.makeVisible();
        s3.makeVisible();
        c1.makeVisible();
        f2.makeVisible();
        
        canvas.wait(200);
        
        c3.makeVisible();
        
        s1.makeInvisible();
        s3.makeInvisible();
        c1.visible();
        f2.makeInvisible();
        //This rocketship end up winning
        s1.slowMoveVertical(-1);
        s3.slowMoveVertical(-1);
        c1.slowMoveVertical(-1);
        f2.slowMoveVertical(-1);
    
        s1.makeVisible();
        s3.makeVisible();
        c1.makeVisible();
        f2.makeVisible();
    }
    
}