public class PrimeOrNot {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        if(n%2==0) {
            System.out.println("Number is not prime");
            System.exit(0);
        }
        for(int i=3;i<n/2;i+=2){
            if(n%i==0) {
                System.out.println("Number is not prime");
                System.exit(0);
            }
        }
        System.out.println("Number is Prime");
    }
}
