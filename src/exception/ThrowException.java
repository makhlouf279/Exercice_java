package exception;
/*
                   [THROW]                                   [THROWS]
* USED TO EXPLICITLY THROW AN EXCEPTION               *USED TO DECLARE AN EXCEPTION
* IS FOLLOWED BY AN INSTANCE                          * IT IS FOLLOWED BY CLASS
* IT IS USED WITH IN THE METHOD                       * IT IS USED WITH METHOD SIGNATURE
* DECLARE ONLY ONE EXCEPTION                          *DECLARE MULTIPLE EXCEPTION
 */

public class ThrowException
{
    public static double divide(double x, double y)
    {
        if(y==0)
        {
            throw new ArithmeticException("la devision par 0 est impossible... ");
        }
        return x/y;

    }

    public static void main(String[] args)
    {
        double d;
        try

        {
            d = divide(5, 2);// appel une methode static
            System.out.println(" le resultat est ------------------- " +d);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("le programme peut continuer ......");
        }

    }
}
