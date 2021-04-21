package lesboucle;

import java.util.Scanner;

public class DoWhile
{

    public static void main(String[] args)
    {
        /*
        int number =0;
        do
       {
           System.out.println("number " +number);
           number++;

       }while(number<5);

*/
//----------------------------------------

        Scanner in =new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("-----MENU-----");
            System.out.println("1---SALADE");
            System.out.println("2---FRUIT");
            System.out.println("3---COUSCOUS");
            System.out.println("4---JU");
            System.out.println("5---SOUPE");
            System.out.println("choisir un menu");
            choice=in.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println(" votre menu est : -----SALADE");
                break;
                case 2:
                    System.out.println(" votre menu est : -----FRUIT");
                    break;
                case 3:
                    System.out.println(" votre menu est : -----COUSCOUS");
                    break;
                case 4:
                    System.out.println(" votre menu est : -----JU");
                    break;
                case 5:
                    System.out.println(" votre menu est : -----SOUPE");
                    break;

                default:

                    System.out.println("YOUR CHOICE NOT ON THE LIST ");
                    break;

            }

                    System.out.println(" THANK YOU");

        }while(choice< 6);

        in.close();
    }

}
