public class Pattern9 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++)
                System.out.print(" ");
            for(int j=64+i;j<=69;j++)
                System.out.print((char)j);
            System.out.println();
        }
    }
}