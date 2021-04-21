package com.aroua;

public class AcounteBancaire {

    private  double balance;

    AcounteBancaire(double balance){
       // balance=1000.0;
        this.balance=balance;
    }
    public void deposer(double somme)  {


        balance+=somme;
        System.out.println("my banck account fund is " +balance);
    }
    public void retirer(double somme)   {
        balance-=somme;
        if (balance>somme){
            System.out.println("my banck account fund is " +balance);
        }else
        {
            throw new NoBalanceException("you dont have a balance in your account");


        }

    }

    public double getBalance() {
        return balance;
    }
}
