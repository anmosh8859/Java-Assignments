public class Main {
    public static void main(String[] args) {
        SuperCar sc;
        sc=SuperCar.getInstance();
        sc.setBrand("Audi");
        System.out.println(sc.getBrand());
        Box b1=new Box();
        Box b2=new Box();
        Box b3=new Box();
        Box.boxCount();
    }
}