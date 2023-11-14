import java.util.Scanner;
public class LastNumberZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        i/=10;
        i*=10;
        System.out.println(i);
    }
}
