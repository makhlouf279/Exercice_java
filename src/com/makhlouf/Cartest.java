package com.makhlouf;

public class Cartest
{
    public static void main(String[] args)
    {
        Car voiture =new Car("volvo");
        voiture.start();
        voiture.speed();
        voiture.showSpeed();
        voiture.stop();
        voiture.showSpeed();
        Car voiture1 =new Car("BMW","red",2020);
        System.out.println(voiture1);// call toString methode in car



    }
}
