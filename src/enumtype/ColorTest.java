package enumtype;

import java.util.Scanner;

public class ColorTest {

    public static void main(String[] args) {
/*
        Scanner input = new Scanner(System.in);
        String choice;
    do {
        System.out.println("-------LIST OF COLOR------");
        System.out.println("1------RED");
        System.out.println("2------GREEN");
        System.out.println("3------YELLOW");
        System.out.println("chose one of those colors ..");
        choice = input.next();
        //Color color = Color.valueOf(choice);

        switch (choice) {
            case "1":
                System.out.println("YOU ARE ENTRED RED " + Color.RED);
                break;

            case "2":
                System.out.println("YOU ARE ENTRED GREEN " + Color.GREEN);
                break;

            case "3":
                System.out.println("YOU ARE ENTRED YELLOW " + Color.YELLOW);
                break;
        }
    }while(choice ==input.next());
        System.out.println("bye");
*/

             //throw new IllegalArgumentException("you have to entred one of those color [RED,YELLOW,GREEN]");
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("ENTER THE COLOR ");
                String insertColor = input.next();
                 Color color = Color.valueOf(insertColor.toUpperCase());

                switch (color) {
                    case RED:
                        System.out.println("YOU ARE ENTRED RED ");
                        break;

                    case GREEN:
                        System.out.println("YOU ARE ENTRED GREEN");
                        break;

                    case YELLOW:
                        System.out.println("YOU ARE ENTRED YELLOW ");
                        break;
                }


            } catch (IllegalArgumentException e) {

                System.out.println("you have to entred one of those color [RED,YELLOW,GREEN]");

            }
            System.out.println("bye");



    }
}
