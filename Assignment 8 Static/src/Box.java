public class Box {
    Box(){
        Box.boxCount++;
    }
    private int length,breadth,height;
    private static int boxCount;
    public void setDimension(int l,int b, int h){
        length=l;
        breadth=b;
        height=h;
    }
    public void showDimension(){
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
        System.out.println("Height: "+height);
    }
    public static void boxCount(){
        System.out.println("Box Count: "+boxCount);
    }
}
