import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=i;
        i=j;
        j=k;
        System.out.println("i: "+i+" j: "+j);
    }
}
