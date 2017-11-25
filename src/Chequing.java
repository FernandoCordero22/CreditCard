import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by alenasynkova on 2017-11-25.
 */
public class Chequing implements Account {

    private int accountID;
    private static final double BALANCE=1000.00;
    private ArrayList<CreditCard> cards;
    private double balance;

    public Chequing(int accID, ArrayList<CreditCard> cards) {
       double balance = 1000.00;
        this.cards = cards;
        balance = BALANCE;
    }

    @Override
    public double getBalance() {
        return balance;   //change that
    }

    public int getAccountID() {
        return accountID;  //change that
    }

    @Override
    public void purchase(double amount) {
        balance = balance - amount;
}

    @Override
    public void setBalance(double amount) {
 balance = amount;
    }
}

//polymorphism
// Fernando.C, Armin.E