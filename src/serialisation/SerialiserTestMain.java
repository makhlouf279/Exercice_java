package serialisation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialiserTestMain {
    public static void main(String[] args) {
        // creation de l`object personne
        SerialiserPersonne personne=new SerialiserPersonne("aroua","makhlouf",43);

    try{
        FileOutputStream file=new FileOutputStream("personne.ser");
        ObjectOutputStream obj=new ObjectOutputStream(file);
        obj.writeObject(personne);
        obj.flush();
        obj.close();

    }catch(IOException e){

        e.printStackTrace();
    }

    }
}
