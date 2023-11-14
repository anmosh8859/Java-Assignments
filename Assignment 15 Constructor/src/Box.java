public class Box {
    private int length, breadth, height;
    Box(){

    }
    Box(int length){
        this.length=length;
    }
    Box(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    public int getLength() {
        return length;
    }

    private void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    private void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    private void setHeight(int height) {
        this.height = height;
    }
}
