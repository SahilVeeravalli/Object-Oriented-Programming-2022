
/**
 * This class implements a dog.
 * 
 * @author (Sahil Veeravalli) 
 * @version (9/22/22
 */
public class Dog
{
    // instance variables - replace the example below with your own
    //Class variable names (String), color (String), weight (int), immnunized (boolean).
    private String name;
    private String color;
    private int weight;
    private boolean immunized;
    /**
     * The default constructor should set 
     * name to Pluto, color to brown, weight to 25 and immunized to false.
     */
    public Dog()
    {
        name = "Pluto";
        color = "brown";
        weight = 25;
        immunized = false;
    }
    
    public Dog(String name1, String color1,int weight1, boolean immunized1)
    {
        name = name1;
        color = color1;
        weight = weight1;
        immunized = immunized1;
    }
    //write an accessor method for each of the instance variables
    //getName(),getColor(),getWeight(),getImmunized()
    //returns name of dog
    public String getName()
    {
        return name;
    }
    //returns color
    public String getColor()
    {
        return color;
    }
    //returns weight of dog
    public int getWeight()
    {
        return weight;
    }
    //returns if dog is immunized
    public boolean getImmunized()
    {
        return immunized;
    }
    //write mutator methods for weight and immunized
    //setWeight(int weight), setImmunized(boolean immunized)
    //changes the weight of dog
    public void setWeight(int weight)
    {
        this.weight = weight;
    }
    //changes immunization status
    public void setImmunized(boolean immunized)
    {
        this.immunized = immunized;
    }
    
    //This method prints the details the dog details.
    public void dogDetails()
    {
        System.out.println("Dog's name --> " + getName());
        System.out.println("Dog's color --> " + getColor());
        System.out.println("Dog's weight --> " + getWeight());
        if (getImmunized())
        {
        System.out.println("Dog is immunized.");
        }
        else
        {
        System.out.println("Dog is not immunized.");
        }
    }
    
}


