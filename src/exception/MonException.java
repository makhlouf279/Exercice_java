package exception;

import java.io.IOException;

public class MonException extends RuntimeException{
    public MonException(String impossible_de_lire_le_fichier, IOException e) {

    }
}
