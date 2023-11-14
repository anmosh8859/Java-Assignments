package Customer;
import Bank.Account;
public class Customer extends Account{
    private String accountType, customerName;
    public void deposit(double money){
        setBalance(getBalance()+money);
    }
    public void withdraw(double money){
        if(money<getBalance())
            setBalance(getBalance()-money);
        else System.out.println("Money is less than Account Balance");
    }
    public double checkBalance(){
        return getBalance();
    }
}
