

/**
 *
 * @author emaph
 */
public class BankAccount {
    private long number;
    private long balance;

    public BankAccount(long initialDeposit) {
        this.balance = initialDeposit;
    }

    public synchronized void deposit(long amount) {
        balance += amount;
    }

    // ... 
}
