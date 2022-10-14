
/**
 * This class implements a pet which has a name, a type, and the weight.
 *
 * @author (Sahil Veeravalli)
 * @version (9/6/2022)
 */
public class Pet
{
    // instance variables - replace the example below with your own
    private String name;
    private String type;
    private int weight;

    /**
     * Constructor for objects of class Pet
     */
    public Pet()
    {
       name = "No Name";
       type = "Human";
       weight = 500;
    }
    public Pet(String name, String type, int weight)
    {
        this.name=name;
        this.type=type;
        this.weight=weight;
    }
    public Pet(String name, String type){
        this.name = name;
        this.type = type;
        weight = 10;
    }
    //this method returns the name of the pet
    public String getName() //accesor method
    {
        return name;        
    }
    //THis method returns the type of pet
    public String getType()
    {
        return type;
    }
    //This method return the weight
    public int getWeight()
    {
        return weight;
    }
    //This method changes name mutator method
    public void setName(String name)
    {
        this.name = name;
        
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setWeight(int weight)
    {
        if(weight>=0 && weight<=100)
        this.weight = weight;
    }
    
}
