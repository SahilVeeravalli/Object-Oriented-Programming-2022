
/**
 * This Class uses shapes
 *
 * @author (Sahil Veeravalli)
 * @version (8/30/22)
 */
public class House
{
    // Creating Objectes
    private Circle c;
    private Square s;
    private Person p;
    private Square sq;
    private Circle su;
    private Canvas canvas;
    private Square sky;
    private Square star;
    private Square star2;
    private Square star3;
    private Triangle r;


    /**
     * Constructor for objects of class House
     */
    public House()
    {
       //This is the constructor, it contains the actions of the code
    canvas = Canvas.getCanvas();
       sky = new Square();
       draw1();
       canvas.wait(1000);
       draw2();
    }
    public void draw1()
    {
        
        // initialise instance variables
        // this starts a blank canvas
        sky.moveHorizontal(-310);
        sky.moveVertical(-120);
        sky.changeColor("white");
        sky.changeSize(500);
        
        //This is the ground
        c = new Circle();
        c.changeSize(1000);
        c.moveHorizontal(-500);
        c.makeVisible();
        c.changeColor("green");
        c.moveVertical(250);
        
        //House structure
        s = new Square();
        s.makeVisible();
        s.changeSize(200);
        s.moveVertical(35);
        s.moveHorizontal(-170);
        
        //person
        p = new Person();
        p.makeVisible();
        p.moveVertical(115);
        
        //window
        sq = new Square();
        sq.makeVisible();
        sq.moveHorizontal(-80);
        sq.moveVertical(60);
        sq.changeColor("blue");
        
        //sun
        su = new Circle();
        su.makeVisible();
        su.changeColor("yellow");
        su.changeSize(100);
        su.moveHorizontal(-180);
        su.moveVertical(-80);
        
        //ceiling/roof
        r = new Triangle();
        r.makeVisible();
        r.changeSize(100,220);
        r.moveVertical(-75);
        r.moveHorizontal(30);
    
        
    }
    public void draw2()
    {

        //New canvas
        sky = new Square();
        sky.moveHorizontal(-310);
        sky.moveVertical(-120);
        sky.changeColor("white");
        sky.changeSize(500);
        su.makeInvisible();
        //grass
        c = new Circle();
        c.changeSize(1000);
        c.moveHorizontal(-500);
        c.makeVisible();
        c.changeColor("green");
        c.moveVertical(250);
        
        //House strucutre
        s = new Square();
        s.makeVisible();
        s.changeSize(200);
        s.moveVertical(35);
        s.moveHorizontal(-170);
        
        //person
        p = new Person();
        p.makeVisible();
        p.moveVertical(115);
        
        //window
        sq = new Square();
        sq.makeVisible();
        sq.moveHorizontal(-80);
        sq.moveVertical(60);
        sq.changeColor("blue");
        
        sky = new Square();
        sky.moveHorizontal(-310);
        sky.moveVertical(-120);
        sky.changeColor("black");
        sky.changeSize(500);
    
        //new sun
        su = new Circle();
        su.makeVisible();
        su.changeSize(100);
        su.moveHorizontal(-180);
        su.moveVertical(-80);
        su.changeColor("yellow");
        
        //roof
        r = new Triangle();
        r.makeVisible();
        r.changeSize(100,220);
        r.moveVertical(-75);
        r.moveHorizontal(30);
        
        //moves the sun to the right (sunrise)
        for(int i = 0; i < 290; i++)
        {
           su.slowMoveHorizontal(1); 
        }
        sky.makeVisible();
         //moon
        su.changeColor("white"); //change it to moon
        
        r = new Triangle();
        r.makeVisible();
        r.changeSize(100,220);
        r.moveVertical(-75);
        r.moveHorizontal(30);
        
        //grass
        c = new Circle();
        c.changeSize(1000);
        c.moveHorizontal(-500);
        c.makeVisible();
        c.changeColor("green");
        c.moveVertical(250);
        
        //square
        s = new Square();
        s.makeVisible();
        s.changeSize(200);
        s.moveVertical(35);
        s.moveHorizontal(-170);
        
        //person
        p = new Person();
        p.makeVisible();
        p.moveVertical(115);
        
        //window
        sq = new Square();
        sq.makeVisible();
        sq.moveHorizontal(-80);
        sq.moveVertical(60);
        sq.changeColor("blue");
        
        //First star
        star = new Square();
        star.makeVisible();
        star.changeColor("white");
        star.changeSize(10);
        star.moveHorizontal(-30);
        star.moveVertical(-60);
        
        //Second star
        star2 = new Square();
        star2.makeVisible();
        star2.changeColor("white");
        star2.changeSize(15);
        star2.moveHorizontal(-150);
        star2.moveVertical(-80);
        
        //Third Star
        star3 = new Square();
        star3.makeVisible();
        star3.changeColor("white");
        star3.changeSize(12);
        star3.moveHorizontal(-200);
        star3.moveVertical(-90);
        
    
    }
    
    }
        


