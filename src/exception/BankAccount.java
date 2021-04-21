
package exception;

public class BankAccount


{
    private double balance;
//----------------------------------------------------
    // constructeur

    public BankAccount()
    {
        balance=0.0;
    }
//-------------------------------------------------------
    //deposit method
    public void deposer(double amount)
    {
        balance+=amount;
    }
//-----------------------------------------------------------
    // withdraw method

    public void retirer(double amount)
    {
        if(amount>balance)
        {
            throw new InSufficientFundException("votre balance est insufisant ........");

        }
          balance=balance-amount;

    }
//----------------------------------------------------------

            // getter method for balance ...
    public double getBalance()
    {
        return balance;
    }
}
