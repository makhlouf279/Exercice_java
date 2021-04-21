package encapsulation;

public class Vehicle //SUPER CLASS
{
    // 2 INSTANCES

    private String model;
    private  int maxSpeed;
    private boolean isAutomatic = false;


    // CONSTRUCTEUR
    public Vehicle(String model,int maxSpeed,boolean isAutomatic)
    {
        this.model=model;
        this.maxSpeed=maxSpeed;
        this.isAutomatic=isAutomatic;
    }
     // METHODE GETTER FOR maxSpeed

    public int getMaxSpeed()
    {

        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }
    /*
    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }
    */

}
