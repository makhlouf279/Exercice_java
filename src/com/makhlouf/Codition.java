package com.makhlouf;

import java.util.Scanner;

public class Codition
{
    public static void main(String[] args)
    {
        Scanner number=new Scanner(System.in);
        System.out.println("saisir 3 nommbres  ");
        int a= number.nextInt();
        int b= number.nextInt();
        int c= number.nextInt();

        if (a>b)
        {
            System.out.println("le nombre est " + a);
        }
        else
            if (a<b)
        {
            System.out.println("le nombre est " + b);

        }
            else
            {
                System.out.println("le nombre est " + c);
            }



    }
}
