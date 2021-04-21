package exception;

public class ThrowableMethod
{
        public static double divide(double x,double y)
        {
            if (y==0)
            {
                throw new ArithmeticException("ArithmeticException occured");
            }
            return x/y;
        }

    public static void main(String[] args)
    {
        double d;
        try
        {
            d=divide(40,0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("la division par 0 est impossible..");

            // 3 throwable method

            System.out.println(e.getMessage());
            //System.out.println(e.toString() );
            //e.printStackTrace();

        }


    }
}
