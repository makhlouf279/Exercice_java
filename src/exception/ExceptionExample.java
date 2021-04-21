package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
[what is an exception??]
[difference between error & exception??]
[TYPE OF EXCEPTION??]
        *3 TYPE OF EXCEPTION IN JAVA
                   -  CHECKED EXCEPTION  exemple: FileNotFoundException
                   - UNCHECKED EXCEPTION exemple: Arithmetic Exception
                   -USER DEFINED EXCEPTION exemple: InSufficientFundException
[TRY-CATCH BLOCK??]
[FINALLY BLOCK??]
[THROW AND THROWS KEYWORDS ??]
[EXCEPTION METHODS ??]
----------------

 */
public class ExceptionExample
{
  public static void main(String[] args)


  {
        boolean isFlag=false;
   do
   {
        try {
            int number1 = 0;
            int number2 = 0;
            int result = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("donner 2 numero ");
            number1 = input.nextInt();
            number2 = input.nextInt();
            result = number1 / number2;
            System.out.println("le resultat = : ---------------- " + result);
            isFlag=true;
            input.close();

        } catch (ArithmeticException e) {
            System.out.println("devision par 0 est impossible......");
        } catch (InputMismatchException e) {
            System.out.println(" il faut entrer un entier pas  de string ....");
        } catch (Exception e) {
            System.out.println(" une Exception est afficher ....");
        } finally {
            System.out.println("try again ...");
        }

   }
   while(!isFlag);
  }
}

