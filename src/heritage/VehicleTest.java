package heritage;

public class VehicleTest
{
    public static void main(String[] args)

    {

        Voiture v = new Voiture(); // creation d`object de la class Voiture
        v.model="VOVLVO";
        v.maxSpeed=280;
        v.type="DEISEL";
        v.print();

        Moto m = new Moto(); // creation d`object de la class Moto
        m.model="YAMAHA";
        m.maxSpeed=300;
        m.type="ESSENCE";
        m.print();


/*
        Vehicle voi=new Voiture();
        voi.model="volvo";
        voi.type="essence";
        voi.maxSpeed=220;
        voi.print();

        Vehicle  mo=new Moto();
        mo.model="yamaha";
        mo.type="essence";
        mo.maxSpeed=300;
        mo.print();
*/
    }


}
