public class HCF {
    public static void main(String[] args) {
        int greatest=Integer.parseInt(args[0])>Integer.parseInt(args[1])?Integer.parseInt(args[0]):Integer.parseInt(args[1]);
        int smallest=Integer.parseInt(args[0])<Integer.parseInt(args[1])?Integer.parseInt(args[0]):Integer.parseInt(args[1]);
        int n=1;
        while(true){
            if(greatest%(smallest/n)==0) {
                System.out.println("HCF: " + smallest / n);
                break;
            }
            n++;
        }
    }
}
