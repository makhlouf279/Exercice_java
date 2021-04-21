package com.makhlouf;

public class Voiture
{
    public static int currentSpeed=0;
    public static int maxSpeed =180 ;
//------------------------------------------------------------
        public  static void shoCurentSpeed(int speed)
        {
             System.out.println("votre vitesse acctuelle est " +speed);
        }

//------------------------------------------------------------
    public static void speedUp(int increase)
    {
        currentSpeed+=increase;
        if (currentSpeed>maxSpeed)
        {
            shoCurentSpeed(currentSpeed);
            System.out.println("ATTENTION DIMINUER LA VITESSE.... ");
        }
        else
            {
                shoCurentSpeed(currentSpeed);
            }
    }
//--------------------------------------------------------------------
    public static void speedDown(int decrease)
    {
        if (currentSpeed<decrease)
        {
            System.out.println("la voiture est arrete");
        }
        else
            {
            currentSpeed -= decrease;
            shoCurentSpeed(currentSpeed);
            }
    }

//---------------------------------------------------------------------
    public static void stop()
    {
        currentSpeed =0;
        shoCurentSpeed(currentSpeed);
        System.out.println("la voiture est arrete");
    }


}




