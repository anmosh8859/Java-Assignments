public class Rectangle {
    private int length, breadth;
    private String borderColour;
    public String getBorderColour() {
        return borderColour;
    }

    public void setBorderColour(String borderColour) {
        this.borderColour = borderColour;
    }

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
    void printRectangleColour(){
        if(borderColour!=null)
            System.out.println("Border Colour: "+this.getBorderColour());
        else
            System.out.println("Set Border Colour First");
    }
}
class FilledRectangle extends Rectangle{
    private String fillColour;
    public String getFillColour() {
        return fillColour;
    }
    public void setFillColour(String fillColour) {
        this.fillColour = fillColour;
    }
    void printRectangleColour(){
        if(getBorderColour()!=null||getFillColour()!=null)
            System.out.println("Border Colour: "+this.getBorderColour()+" Filled Colour: "+getFillColour());
        else
            System.out.println("Set Border Colour and Border Colour First");
    }
}