package aroua;

import java.util.InputMismatchException;
import java.util.Scanner; // buit in java package java.util

public class MultiTest
{
    public static void main(String[] args) {
        try {
            Scanner m = new Scanner(System.in);
            System.out.println("donner 2 nombre  ");
            int number = m.nextInt();// saisir 2 nombre entier
            int number1 = m.nextInt();
            Multiply num = new Multiply();// creation d`un objet
            num.multiply(number, number1);// appel de la methode
            Add num1 = new Add();// creation d`un objet
            num1.addition(number, number1);
        }catch(InputMismatchException e){

            System.out.println("Entrer un nombre entier..");
        }

    }




}
