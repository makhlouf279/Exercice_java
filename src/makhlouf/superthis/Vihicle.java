package makhlouf.superthis;

public class Vihicle  // super class
{
    private String model, type;
   private int maxSpeed;

    // constructeur........

    public Vihicle(String model, String type, int maxSpeed)
    {
        this.model=model;
        this.type=type;
        this.maxSpeed=maxSpeed;
    }
    // getter methode--


    public String getModel()
    {
        return model;
    }

    public String getType()
    {
        return type;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }
}
