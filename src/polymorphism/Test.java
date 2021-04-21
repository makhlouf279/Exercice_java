package polymorphism;

public class Test
{
    public static void main(String[] args)
    {

             Vehicle c=new Car();
             //this work because car is a subclass of vehicle
             c.accelerate();
             Vehicle m=new Motocycle();
        //this work because Motocycle is a subclass of vehicle
             m.accelerate();
    }
}
