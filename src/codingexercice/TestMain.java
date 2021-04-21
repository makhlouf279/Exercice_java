package codingexercice;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        CompteBancaire compteBancaire = new CompteBancaire(2500.3);
        Scanner input = new Scanner(System.in);

        int choice;
        do {
            System.out.println("----YOUR BANK ACCOUNT----");
            System.out.println("1 DIPOSIT");
            System.out.println("2 WITHDRAW");
            System.out.println("3 YOUR SOLD");
            System.out.println("4 EXIT");
            System.out.println("CHOSE AN OPTION");

            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("LA SOMME A DIPOSER  ");
                    compteBancaire.diposer(input.nextFloat());
                }
                break;

                case 2: {
                    try {
                        System.out.println("LA SOMME A RETIRER  ");
                        compteBancaire.retirer(input.nextFloat());
                    }catch(PasDeSoldeException e){
                        System.out.println(e.getMessage());

                        /*
                        System.out.println("Affichage d`exception");
                        e.printStackTrace();*/
                    }
                }
                break;

                case 3: {
                    System.out.println("YOUR SOLDE ");
                    System.out.println(compteBancaire.getSolde());

                }
                break;
            }
        }while(choice != 4);
        System.out.println("THANK YOU -----");



    }
}
