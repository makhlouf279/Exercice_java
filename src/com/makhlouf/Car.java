package com.makhlouf;

public class Car
{
    private String model;         // 2 variable d`instance
    private int curentspeed;
    private String color;
    private int year;

    // constructeur
    public Car(String model)
    {
        this.model=model;
    }

    public Car(String model, String color, int year)
    {
        this.model=model;
        this.color=color;
        this.year=year;
    }

    public void start()// methode start
    {
        System.out.println("la voiture de model " +this.model + " demarre");
    }

    public void speed() // methode speed
    {
        this.curentspeed+=25;
    }
    public void stop()// methode stop
    {
        System.out.println("la voiture de model " +this.model+ " est en stop");
        this.curentspeed=0;

    }

    public void showSpeed()
    {
        System.out.println("la  vitesse de voiture  " +this.model+ " est " +this.curentspeed);
    }
    public String toString()
    {
        return "model  " + this.model+ " year  " + this.year + " color " + this.color;
    }

}
