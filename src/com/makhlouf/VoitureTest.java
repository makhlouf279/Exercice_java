package com.makhlouf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VoitureTest 
{
    public static void main(String[] args)
    {

        try
        {

            Scanner vitesse = new Scanner(System.in);
            System.out.println("donner une vitesse");
            int vit = vitesse.nextInt();
            Voiture.shoCurentSpeed(vit);
            Voiture.currentSpeed += vit;
            Voiture.speedUp(60);
            Voiture.speedDown(160);
            Voiture.currentSpeed -= vit;
            Voiture.stop();
        }
        catch(InputMismatchException e)
        {
            System.out.println("la vitese doit etre un entier ...");
        }


        /* il faut pas crier un object tantque
        les methode sont statique qui peuvent pas etre instancier
         */

/*

        Voiture.speedUp(60);
        Voiture.speedUp(160);
        Voiture.speedUp(160);
        Voiture.speedDown(50);
        Voiture.stop();
*/
    }
}
