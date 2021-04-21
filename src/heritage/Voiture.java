package heritage;

public class Voiture extends Vehicle
{
    @Override
    public void print() {
        System.out.println("carecteristique de la voiture");
        super.print();
    }
}
