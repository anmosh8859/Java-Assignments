import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev=0;
        while(num>0){
            rev+=num%10;
            num/=10;
            if(num>0) {
                rev*=10;
            }
        }
        System.out.println("Reverse Number: "+rev);
    }
}
