package exception;
/*
Lors de la détection d'une erreur, un objet qui hérite de la classe Exception est créé
(on dit qu'une exception est levée) et propagé à travers la pile d'exécution jusqu'à ce qu'il soit traité.
 */
public class ExerciceException  {
    public static void main(String[] args) {
        int i=4;
        int j=0;
        try {
            System.out.println("devision de 2 nombre " + (i / j));
        }
        catch(ArithmeticException e){
            System.out.println("getmessage");
            System.out.println(e.getMessage());
            System.out.println(" ");
            System.out.println("toString");
            System.out.println(e.toString());
            System.out.println(" ");
            System.out.println("printStackTrace");
            //e.printStackTrace();
        }
        /*
        catch (Exception e){

        }*/
/*
ATTENTION.............
erreur à la compil SI Exception est traité en premier alors que ArithmeticException est une sous-classe de Exception
 */

        finally {
            System.out.println(" bonjour");
        }



    }
}
/*
La classe Throwable
Cette classe descend directement de la classe Object : c'est la classe de base pour le traitement des erreurs.
Cette classe possède deux constructeurs :
*****          Throwable()
*****           Throwable(String)-----
La chaîne en paramètre permet de définir un message qui
décrit l'exception et qui pourra être consulté dans un bloc catch.

 */
