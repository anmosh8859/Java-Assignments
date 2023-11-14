import java.lang.Math;
public class Roots {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        double d=(b*b-4*a*c);
        System.out.println(d);
        if(d<0)
            System.out.println("Roots are Imaginary");
        else if(d==0)
            System.out.println("Roots are equal and Root: "+(-b/2*a));
        else System.out.println("Root 1: "+(int)((-b+Math.sqrt(d))/2*a)+" Root 2: "+ (int)((-b-Math.sqrt(d))/2*a));
    }
}
