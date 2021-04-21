package com.makhlouf;

import java.util.Scanner;

public class Nombre
{

    public static void main(String[] args)

    {
        Scanner num=new Scanner(System.in);
        System.out.println("donne l`age de la personne");
        int a = num.nextInt();

        if(a < 10)

        {
            System.out.println("the person is child ");
        }
        else
            if(a <18)
            {
                System.out.println("the person is tenager");
            }
            else
        {

            System.out.println("the person is adult");
        }
            num.close();
    }
}
