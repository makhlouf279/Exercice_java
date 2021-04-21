package encapsulation;

public class Car extends Vehicle  // SUBCLASS
{

    //private boolean isAutomatic = false;

    public Car(String model, int maxSpeed,boolean isAutomatic) // constructeur

    {
        super(model, maxSpeed,isAutomatic);
        //this.isAutomatic=isAutomatic;
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
