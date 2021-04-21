
package string;
import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner  in= new Scanner(System.in);
        System.out.println("entre a string");
        String s =in.nextLine();
        int lengh=s.length();
        System.out.println("la  taille de la chiane est " +lengh);
//---------------------------------------------------------------
        String reverstring = " ";
        for(int i=lengh-1;i>=0;i--)
        {
            reverstring=reverstring+s.charAt(i);                           //[METHODE N1]
        }
        System.out.println("la chaine reversee est : " + reverstring);
        in.close();
//--------------------------------------------------------------------------
       // StringBuilder builder =new StringBuilder(s);                               //[METHODE N2]
        //System.out.println("la chaine reversee est : " +builder.reverse());
//----------------------------------------------------------------------------------------

    }
}
