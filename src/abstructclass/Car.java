package abstructclass;

public  class Car extends Vehicle
{
    public Car(String type, String model)
    {
        super(type, model);
    }



    @Override
    public int getMaxSpeed()
    {
        final int MAX_CAR_SPEED=320;
        System.out.println("max speed of the car is " +MAX_CAR_SPEED);
        return MAX_CAR_SPEED;
    }

   // non-abstract methode
   @Override
    public void start()
    {
        System.out.println("car has started..");
    }

    @Override
    public void stop()
    {
        System.out.println("car has stoped..");
    }


}
