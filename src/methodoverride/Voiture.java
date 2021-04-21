package methodoverride;

public class Voiture extends Vihicle
{
    @Override
    public void start() {
        super.start();
    }

    @Override
    public void accelerate(int speed) {
        super.accelerate(speed);
    }

    @Override
    public void stop() {
        super.stop();
    }
    /*
    public void start()
    {
        System.out.println("la voiture va demarrer ");
    }
    //-------------------------------------------
    public void accelerate(int speed)
    {
        System.out.println("la vitesse de la voiture est  " +speed);
    }
    //------------------------------------------------
    public void stop()
    {
        System.out.println("la voiture est arreter");
    }
*/

}
