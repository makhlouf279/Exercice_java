package lesboucle;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        System.out.println("-----------CALCULATOR---------------");
        Scanner num= new Scanner(System.in);
        System.out.println(" whrite 3 numbers ");
        double n1=num.nextDouble();
        double n2=num.nextDouble();
        double n3=num.nextDouble();
        System.out.println(" chaisir un operateur ---+,-,*,/---- ");
        char operator = num.next().charAt(0);// convertir l`operateur arithmetique en int
        double result=0.0;
        // on va utiliser la boocle switch ----

        switch (operator)
        {
            case '+':
                 result=n1+n2+n3;
                //System.out.println(" the result = "+result);
                 break;

            case '*':
                result=n1*n2*n3;
                //System.out.println(" the result = "+result);
                break;

            case '-':
                result=n1-n2-n3;
                //System.out.println(" the result = "+result);
                break;

            case '/':
                result=n1/n2/n3;
               // System.out.println(" the result = "+result);
                break;

            default:
                System.out.println("Error--- try again");
                return; // return pour sortir de programe


        }
        System.out.println(n1+" " +operator+" " +n2+ " "+operator+ " "+n3+ "= " + result);
        num.close();


    }



}
