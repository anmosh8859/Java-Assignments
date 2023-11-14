public class Pattern6 {
    public static void main(String[] args) {
        for(char i=1;i<=5;i++){
            for(char j=1;j<i;j++)
                System.out.print(" ");
            for(char j=65;j<=70-i;j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
