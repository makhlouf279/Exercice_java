package polymorphism;

public class Car  extends Vehicle // SUBCLASS
{
    @Override
    public void accelerate()
    {
        //super.accelerate();
        System.out.println("ths car is acceerating..");
    }
}
