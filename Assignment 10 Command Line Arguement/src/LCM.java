public class LCM {
    public static void main(String[] args) {
        int lcm=0;
        int smaller=Integer.parseInt(args[0])<Integer.parseInt(args[1])?Integer.parseInt(args[0]):Integer.parseInt(args[1]);
        int greater=Integer.parseInt(args[0])>Integer.parseInt(args[1])?Integer.parseInt(args[0]):Integer.parseInt(args[1]);
        for(int i=1;(smaller*i)%greater!=0;i++)
            lcm=(i+1)*smaller;
        System.out.println("LCM: "+lcm);
    }
}
