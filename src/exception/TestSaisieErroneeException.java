package exception;

public class TestSaisieErroneeException {


            public static void controle(String chaine) throws SaisieErroneeException{
             if (chaine.equals("") == true) {
            throw new SaisieErroneeException("Saisie erronee : chaine vide");
        }
            }
   public static void main (String[]args){

                    String chaine1 = "";
                    String chaine2 = "ggl";

                    try {
                        controle(chaine1);
                    } catch (SaisieErroneeException e) {
                        System.out.println("Chaine1 saisie erronee");
                    }

                    try {
                        controle(chaine2);
                    } catch (SaisieErroneeException e) {
                        System.out.println("Chaine2 saisie erronee");
                    }
                }

   }


