import java.util.Scanner;
public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println((num1>num2?num1:num2)+" is greater number.");
    }
}
