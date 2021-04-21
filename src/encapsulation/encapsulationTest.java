package encapsulation;

public class encapsulationTest

{
    public static void main(String[] args)
    {


        //crier un object Car
       // Car c = new Car("volvo", 280,true);
        Vehicle c=new Car("volvo",240,true ); //polymorphisme
        System.out.println("model= " +c.getModel());
        System.out.println("maxSpeed= " +c.getMaxSpeed());
        System.out.println("isAutomatic= " +c.isAutomatic());

    }
}
