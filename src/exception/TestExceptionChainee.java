package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestExceptionChainee
{
    public static void main(String[] args) {
        try {
            String donnees = lireFichier();
            System.out.println("donnees=" + donnees);
        } catch (MonException e) {
           // e.printStackTrace();
            System.out.println(e.getCause().getMessage());
        }
    }

    public static String lireFichier() throws MonException {
        File fichier = new File("c:/Users/makhl/Desktop/cours_java/exceptions.pdf");
        FileReader reader = null;

        StringBuffer donnees = new StringBuffer();

        try {
            reader = new FileReader(fichier);
            char[] buffer = new char[2048];
            int len;
            while ((len = reader.read(buffer)) > 0) {
                donnees.append(buffer, 0, len);
            }
        } catch (IOException e) {
            throw new MonException("Impossible de lire le fichier", e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return donnees.toString();
    }
}
