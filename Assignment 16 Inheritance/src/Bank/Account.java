package Bank;
public class Account {
        private int accountNumber;
        private double balance;

        protected double getBalance() {
                return balance;
        }
        protected void setBalance(double balance) {
                this.balance = balance;
        }
}