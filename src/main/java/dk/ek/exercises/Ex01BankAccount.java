package dk.ek.exercises;

public class Ex01BankAccount {
    static class BankAccount {
        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public void withdraw(double amount) {
            if (balance < amount) {
                balance -= amount;
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient funds.");
            }
        }

        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(100);
        acc.withdraw(120);  // should fail, but succeeds
        System.out.println("Balance: " + acc.getBalance());
    }

}
