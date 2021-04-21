package serialisation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialserPersonne {

    public static void main(String[] args) {
        try {
            FileInputStream fichier = new FileInputStream("personne.ser");
            ObjectInputStream obj = new ObjectInputStream(fichier);
            SerialiserPersonne personne = (SerialiserPersonne) obj.readObject();

            System.out.println("Personne....");
            System.out.println("nom " + personne.getNom());
            System.out.println("prenom " + personne.getPrenom());
            System.out.println("age " + personne.getAge());

        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }


    }

}
