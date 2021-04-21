package codingexercice;

/**
 * @author makhlouf
 */
public class PasDeSoldeException extends RuntimeException{

    private String message;
    PasDeSoldeException(String message){
        this.message=message;

    }

    @Override
    public String getMessage() {
        return message;
    }
}
