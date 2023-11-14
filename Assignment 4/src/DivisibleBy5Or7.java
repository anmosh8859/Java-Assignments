import java.util.Scanner;
public class DivisibleBy5Or7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num= sc.nextInt();
        System.out.println((num%5==0||num%7==0)?"Entered Number is Divisible by 5 or 7":"Entered Number is not Divisible by 5 or 7");
    }
}
