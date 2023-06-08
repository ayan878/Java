//23. WAP to implement the usage of customized exceptions.

package Experiment;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            throw new InsufficientFundsException("Insufficient funds. Current balance: " + balance);
        }
    }
}

public class Experiment_23 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        try {
            account.withdraw(200);
            account.withdraw(400);
            account.withdraw(500);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
