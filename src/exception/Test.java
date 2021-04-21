package exception;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        BankAccount acc =new BankAccount(); // construire un object compte bancaire
        Scanner input=new Scanner(System.in); // saisir vote account
        int choice;
            do
                {
                    System.out.println("-----BANK ACCOUNT MENU----");
                    System.out.println("1- DEPOSIT ");
                    System.out.println("2- WITHDRW ");
                    System.out.println("3- SHOW CURRENT BALANCE ");
                    System.out.println("4- QUIT");
                    System.out.println("SELECT YOUR OPTION ");
                    choice =input.nextInt();
//--------------------------------------------------------------------------------------------------

                    switch (choice)
                    {
                        case 1:

                           System.out.println("deposit amount " );
                           acc.deposer(input.nextInt());
                           break;
//------------------------------------------------------------------------------------------------
                        case 2:
                            System.out.println("withdraw amount.. " );
                            System.out.println( "show the corrent balance  " +acc.getBalance() );


                            try
                            {
                                acc.retirer(input.nextInt());
                            }
                            catch (InSufficientFundException e)
                            {
                                System.out.println(e.toString());
                                System.out.println(e.getMessage());
                                e.printStackTrace();
                            }
/*
                            catch (InputMismatchException e)
                            {
                                System.out.println("il faut entrer un entier....");
                            }*/
                            break;
//-------------------------------------------------------------------------------------------
                        case 3:
                            System.out.println( "show the corrent balance  " +acc.getBalance() );

                            break;


                    }

//-------------------------------------------------------------------------------------------
                }
            while (choice !=4);
        System.out.println( "a la prochaine");

    }
}
