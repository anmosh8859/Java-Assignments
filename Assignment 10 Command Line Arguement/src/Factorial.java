public class Factorial {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        int fact=1;
        while(num>1)
            fact*=(num--);
        System.out.println("Factorial: "+fact);
    }
}