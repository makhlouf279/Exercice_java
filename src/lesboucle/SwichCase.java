package lesboucle;

import java.util.Scanner;

public class SwichCase
{
    public static void main(String[] args) {
            int d;
            Scanner number = new Scanner(System.in);
            System.out.println("donner le nombre de jour ");
        do{
             d = number.nextInt();
            // String nom;

            switch (d) {
                case 1:
                    System.out.println("mon nom c`est makhlouf ");
                    break;

                case 2:
                    System.out.println("mon nom c`est latifa ");
                    break;

                case 3:
                    System.out.println("mon nom c`est joud ");
                    break;

                case 4:
                    System.out.println("mon nom c`est leen ");
                    break;


                default:
                    System.out.println("Error");
                    break;
            }
            System.out.println("THANKS ");
        }while (d != 4);

            number.close();

    }
}
