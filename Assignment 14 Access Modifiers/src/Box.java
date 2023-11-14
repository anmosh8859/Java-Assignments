public class Box {
    private int length, breadth, height;
    protected double volume, surfaceArea;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int volume(){
        int l=getLength();
        int b=getBreadth();
        int h=getHeight();
        return l*b*h;
    }
    public long surfaceArea(){
        int l=getLength();
        int b=getBreadth();
        int h=getHeight();
        return 2*(l*b+b*h+l*h);
    }
}
