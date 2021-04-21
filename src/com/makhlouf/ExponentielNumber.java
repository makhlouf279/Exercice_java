package com.makhlouf;

import java.util.Scanner;

public class ExponentielNumber

{
    public static void main(String[] args)
    {
        Scanner d =new Scanner(System.in);
        System.out.println("give the base number ");
        int n1=d.nextInt();
        System.out.println("give the exposant number  ");
        int n2=d.nextInt();
        for(int i =0;i<n2;i++)
        {
            System.out.println("the power of " + n1+ " by " +i+ " is  " +power(n1,i));// appelle de la methose

        }

        d.close();
    }
   public static int power(int num, int pow)
   {
       return (int) Math.pow(num,pow);
   }

}
