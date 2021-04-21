package makhlouf.superthis;

public class SuperThisClass
{
    public static void main(String[] args)
    {
        // creation de voiture object

          Voiture v=new Voiture("volvo","Esscence",240,true);
          System.out.println(v.getModel());
          System.out.println(v.getType());
          System.out.println(v.getMaxSpeed());
          System.out.println(v.isAutomatic());

    }
}
