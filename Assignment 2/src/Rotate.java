import java.util.Scanner;
public class Rotate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int j=num, k=1;
        while(num>10){
            num/=10;
            k*=10;
        }
        num=j%10;
        j/=10;
        num*=k;
        num+=j;
        System.out.println("Rotated Number: "+num);
    }
}
