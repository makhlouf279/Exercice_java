package methodoverride;

public class OverrideTest
{
    public static void main(String[] args)
    {
        //create a vihicle object
/*
        Vihicle v= new Vihicle();
        v.start();
        v.accelerate(150);
        v.stop();
*/
        // create a voiture object

        Voiture voi= new Voiture();
        voi.start();
        voi.accelerate(100);
        voi.stop();
    }
}
