package com.aroua;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {

        AcounteBancaire acc =new AcounteBancaire(1000);
        Scanner input= new Scanner(System.in);

        int choice;
    do {
        System.out.println("-----BANK ACCOUNT MENU----");
        System.out.println("1- DEPOSIT ");
        System.out.println("2- WITHDRW ");
        System.out.println("3- SHOW CURRENT BALANCE ");
        System.out.println("4- QUIT");
        System.out.println("SELECT YOUR OPTION ");

        choice = input.nextInt();

        switch (choice) {
            case 1:
                 System.out.println("DEPOSIT");
                 try {
                     acc.deposer(input.nextInt());
                 }catch (InputMismatchException e){

                    System.out.println("INVALID diposit2....try agin");
                    }

                break;

            case 2:

                System.out.println("WITHDRW");
                System.out.println("my account balance is " + acc.getBalance());
                    try {
                        acc.retirer(input.nextInt());
                    }catch (NoBalanceException e) {
                        System.out.println(e.toString());
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                    }
                    catch (InputMismatchException e){
                        System.out.println("INVALID withdraw......try again");
                    }

                break;

            case 3:
                System.out.println("my current balance is " + acc.getBalance());
                break;

        }
    }while (choice!=4);
        System.out.println("thank you");
    }
}
