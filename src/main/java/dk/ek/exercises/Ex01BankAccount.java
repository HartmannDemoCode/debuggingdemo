package dk.ek.exercises;

/**
 * purpose: to exercise debugging skills
 * 1. Create a junit test for this class
 * 2. Setup a test that asserts false for the ex1 method call
 * 3. Run the debugger and find out why ex1 is not producing 'false'
 */
public class Ex01BankAccount {

    static class BankAccount {
        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public boolean withdraw(double amount) {
            if (balance < amount) {
                balance -= amount;
                System.out.println("Withdrawal successful.");
                return true;
            } else {
                System.out.println("Insufficient funds.");
                return false;
            }
        }

        public double getBalance() {
            return balance;
        }


    }
    public boolean ex1() {
        BankAccount acc = new BankAccount(100);
        boolean result = acc.withdraw(120);  // should fail, but succeeds
        System.out.println("Balance: " + acc.getBalance());
        return result;
    }

    public static void main(String[] args) {

    }

}
