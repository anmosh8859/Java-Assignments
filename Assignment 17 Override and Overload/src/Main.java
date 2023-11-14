public class Main {
    public static void main(String[] args) {
        ThickCircle t=new ThickCircle();
        t.setRadius(9);
        t.setThickness(7);
        System.out.println("Area of thickness: "+t.getArea());
        FilledRectangle f=new FilledRectangle();
        f.setBorderColour("Green");
        f.setFillColour("Blue");
        f.printRectangleColour();
        Coordinate c=new Coordinate();
        c.setX(3);
        c.setY(2);
        System.out.println("Distance between (3,2) and (9,7): "+c.getDistance(9,7));
        c.setX(3);
        c.setY(4);
        System.out.println("Distance between (4,3) from origin: "+c.getDistance());
        Person p= new Person();
        p.setPerson("The Anand M Sharma");
        p.showName();
        p.showName("Mr");
    }
}