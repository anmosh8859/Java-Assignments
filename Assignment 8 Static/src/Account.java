public class Account {
    private int accountNumber;
    private float balence;
    private String customerName;
    private static float rateOfInterest;
    void setAccountNumber(int x){
        accountNumber=x;
    }
    void setCustomerName(String x){
        customerName=x;
    }
    void setBalance(float x){
        balence=x;
    }
    void setRateOfInterest(float x){
        rateOfInterest=x;
    }
    float simpleInterest(int time){
        return ((balence*rateOfInterest*time)/100);
    }
    int getAccountNumber(){
        return accountNumber;
    }
    float getBalance() {
        return balence;
    }
    String getCustomerName(){
        return customerName;
    }
}
