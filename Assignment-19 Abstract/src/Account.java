abstract public class Account {
    private static double balance,rateOfInterest;
    private static int accountNo;

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        Account.balance = balance;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        Account.rateOfInterest = rateOfInterest;
    }

    public static int getAccountNo() {
        return accountNo;
    }

    public static void setAccountNo(int accountNo) {
        Account.accountNo = accountNo;
    }
    abstract double calculateInterest(int time);
}
class SavingAccount extends Account{
    private String customerName;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    double calculateInterest(int time) {
        return (getBalance()*getRateOfInterest()*time)/100;
    }
}
class Driver{
    public static void main(String[] args) {
        SavingAccount sa= new SavingAccount();
        sa.setRateOfInterest(5);
        sa.setBalance(100000);
        sa.setCustomerName("The Anand Mohan Sharma");
        System.out.println("Rate of Interest: "+sa.calculateInterest(2));
    }
}