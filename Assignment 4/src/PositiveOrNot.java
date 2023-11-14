import java.util.Scanner;
public class PositiveOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0) System.out.println("Number is Positive");
        else System.out.println("Number is Non Positive");
    }
}
