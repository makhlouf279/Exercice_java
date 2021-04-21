package nest;


//------------------------------
public class StaticNestedExemple

{
    static int a=5;
    private static int b=10;
     int c=15;


//-----------------------------------
 class  StaticNestedClass
    {


        void show()
        {
           System.out.println(a);
           System.out.println(b);
           System.out.println(c);// ---message d`erreur a cause de c n`est static
        }

    }

}
