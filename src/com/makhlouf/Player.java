package com.makhlouf;

import java.util.Scanner;

public class Player
{

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        double a, b ;
        //int b=15;
        //c=a+b;
        System.out.println("donner le resultat  de a ");
        a= input.nextDouble();
        System.out.println("donner le resultat  de b");
         b= input.nextDouble();
        System.out.println("la somme de a et b = " +(a+b));
        input.close();

    }
}
