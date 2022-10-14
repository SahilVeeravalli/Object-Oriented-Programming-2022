
/**
 * This class implements a Person
 *
 * @author (Sahil Veeravalli)
 * @version (9/7/22)
 */
public class Person
{
    private String firstname;
    private String lastname;
    private String phonenumber;
    private double weight;
    private boolean resident;
    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
        firstname = "Mod 4";
        lastname = "OOP";
        phonenumber = "911";
        weight = 100;
        resident = true; 
        
    }
    public Person(String firstname, String lastname, String phonenumber, 
    boolean resident)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.resident = resident;
    }
    public Person(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public Person(String firstname, String lastname, String phonenumber)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
    }
    public Person(String phonenumber)
    {
        this.phonenumber = phonenumber;
    }
    public String getFirstname()
    {
        return firstname;
    }
    public String getLastname()
    {
        return lastname;
    }
    public String getPhonenumber()
    {
        return phonenumber;
    }
    public double getWeight()
    {
        return weight;
    }
    public boolean getResident()
    {
        return resident;
    }
    public void changeFirstname(String firstname)
    {
        this.firstname = "OOP";
    }
    public void setLastname(String lastname)
    {
        this.lastname = "Ok";
    }
    public void setPhonenumber(String phonenumber)
    {
        this.phonenumber = "01";
    }
    public void setWeight(double newWeight)
    {
        this.weight = newWeight;
    }
}
