package ArrayList;


import java.util.ArrayList;

public class Exemple {
        public static void main(String[] args) {

            //Création de ArrayList
            ArrayList<String> list = new ArrayList<String>();
            //Stocker 2 éléments
            list.add("abc");
            list.add("xyz");
            list.add("makhlouf");
            list.add("aroua");
            list.get(0);

            //Afficher la taille de la liste
            System.out.println(list.size());   //2
            System.out.println(list.get(0));
        }
    }

