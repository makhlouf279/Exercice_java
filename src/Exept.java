public class Exept
{
    public static void main(String[] args)
    {
        try {

            int[] mak = {1, 5, 5};
            System.out.println(mak[4]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
                System.out.println("il ya un messga d`erreur");
        }

        System.out.println("les element de tableau sont..");
    }
}
