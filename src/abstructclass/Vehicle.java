package abstructclass;

public  abstract class Vehicle
{
    String type , model ;

    // constructeur
//-----------------------------------------------------
        public Vehicle(String type, String model)
        {
        this.type = type;
        this.model = model;

        }



    //-----------------------------------------
// non-abstract methode
    public void start()
    {
        System.out.println("vehicle has started..");
    }
    public void stop()
    {
        System.out.println("vehicle has stoped..");
    }
//--------------------------------------------------------
        // abstract method with no body
        public abstract int getMaxSpeed();



}
