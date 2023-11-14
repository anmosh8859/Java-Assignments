public class Cuboid {
    int length, breadth, height;
    void setter(int l, int b, int h){
        length=l;
        breadth=b;
        height=h;
    }
    void getter(){
        System.out.println("Length: "+length);
        System.out.println("Width: "+breadth);
        System.out.println("Height: "+height);
    }

    public static void main(String[] args) {
        Cuboid c=new Cuboid();
        c.setter(15,16,17);
        c.getter();
    }
}
