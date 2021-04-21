package exception;

public class InSufficientFundException extends RuntimeException
{
    private String message;

    public InSufficientFundException(String message) //constructeur

    {
        this.message=message;
    }
// getter method for message
    @Override
    public String getMessage()
    {
        return message;
    }
}
