package makhlouf.superthis;

public class Voiture extends Vihicle
{
private boolean isAutomatic = false;
     public Voiture(String model, String type, int maxSpeed, boolean isAutomatic)
     {
        super(model, type, maxSpeed);// super class constructor calling
         this.isAutomatic=isAutomatic;
    }
    // gettter methode

    public boolean isAutomatic()
    {
        return isAutomatic;
    }
}
