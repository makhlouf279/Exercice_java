package exception;
//throws exception if we know the exception



public class ThrowsException
{
    public static void devide() throws ArithmeticException, NumberFormatException
    {
        double a= Double.parseDouble("8");
        double b= Double.parseDouble("5");
        double c=a/b;
        System.out.println(" the result is " +c);

    }
    public static void main(String[] args)
    {

        try
        {
            devide();
        }
        catch (NumberFormatException e)
        {
            System.out.println("invalid number format...");

        }
        catch (ArithmeticException e)
        {
            System.out.println("we cant devide number by 0...");

        }
    }
}
