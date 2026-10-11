class ATM {
    double balance = 5000;

    void withdraw(double amount) {
        if (amount > balance) {
            throw new RuntimeException("Insufficient Balance");
        }
        balance = balance - amount;
        System.out.println("Money Withdrawn");
    }
}

public class ATMWithdrawalSystem {
    public static void main(String[] args) {
        ATM atm = new ATM();
        try {
            atm.withdraw(6000);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction Completed");
        }
    }
}