/**
 * Created by alenasynkova on 2017-11-25.
 */
public class CreditCard implements Account {

    private double balance=1000.00;
private static int number=365187345;
private String account="chequing";
    private static final double MONTHLY_FEE = 10.0;

    public CreditCard(int cardNumber, double balance, Chequing account) {
    }


    // Returns balance if the current balance is less than 1000, otherwise returns (balance - MONTHLY_FEE)
    @Override
    public double getBalance() {
        return balance;  //change that
    }

    public int getCardNumber() {
        return number;    //change that
    }

    @Override
    public void purchase(double amount) {
        assert balance > 1000;

    }

    @Override
    public void setBalance(double amount) {

    }

}
