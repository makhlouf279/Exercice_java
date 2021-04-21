package interfaceclass;

public class Car implements Drivable
{

    @Override
    public void turnLeft()
    {
        System.out.println("car can turn left");
    }

    @Override
    public void turnRight()
     {
         System.out.println("car can turn right");
    }
}
