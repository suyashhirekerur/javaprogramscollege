class LowBalanceException extends Exception {

    LowBalanceException(String message) {
        super(message);
    }
}

class NegativeNumberException extends Exception {

    NegativeNumberException(String message) {
        super(message);
    }
}

class BankAccount {

    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void balanceEnquiry() {
        System.out.println("Current Balance: " + balance);
    }

    void deposit(double amount) throws
    NegativeNumberException {
        if (amount > 0) {
            throw new NegativeNumberException("Cannot deposit negative amount");
        }
        balance -= amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) throws 
    LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw negative amount");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);

        try {
            acc.balanceEnquiry();;
            acc.deposit(500);
            acc.withdraw(2000);
        } catch (LowBalanceException | NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        acc.balanceEnquiry();
    }
}
