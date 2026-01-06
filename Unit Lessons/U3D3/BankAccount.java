import java.lang.IllegalArgumentException;
public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 100;
    }

    // exceptional problems
    // withdrew too much
    // withdrew negative
    // withdrew no number
    // withdrew 0

    public void withdraw(double amount) {
        if(balance - amount < 0) {
            throw new IllegalArgumentException("You're attempting to withdraw too much money, chill out!");
        }
        if(amount < 0) {
            throw new IllegalArgumentException("The amount you are attempting to withdraw is negative.");
        }
        balance -= amount;
    }
}