import java.lang.Math;
public class RandomNum {
    public static void main(String[] args) {
        int c=0;
        while(c==0){
            c=(int)(Math.random()*1000);
            if(c<200&&c>100) {
                System.out.println("Random Number: " + c);
            }
            else c=0;
        }
    }
}
