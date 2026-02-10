class Account {
    protected double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {

    SavingsAccount(double balance) {
        super(balance);
    }

    void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 100) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal denied. Minimum balance of 100 required.");
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(500);
        sa.withdraw(350);
        System.out.println(sa.getBalance());
        sa.withdraw(100);
        System.out.println(sa.getBalance());
    }
}
