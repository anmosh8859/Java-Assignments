import java.util.Scanner;
public class ThreeDigitNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num!=0&&num>100) {
            for (int i = 3; i > 0; i--) num /= 10;
            if (num == 0) System.out.println("Number is three digit number.");
            else System.out.println("Number is not three digit number.");
        }
        else System.out.println("Number is not three digit number.");
    }
}
