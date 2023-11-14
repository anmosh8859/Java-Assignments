public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HelloWorld h= new HelloWorld();
        h.a.b1.message();
        h.a.b2.message();
        Circle c=new Circle();
        c.setRadius(7);
        System.out.println("Radius: "+c.getRadius());
        System.out.println("Area of Circle of radius 7: "+c.area());
        System.out.println("Circumference of the Circle have radius 7: "+c.circumference());
        Employee e=new Employee();
        e.setSalary(1553134.256);
        e.setEmpid(591259);
        e.setName("The Anand M Sharma");
        System.out.println("Salary: "+e.salary);
        System.out.println("Employee Id: "+e.getEmpid());
        Box b=new Box();
        b.setLength(5);
        b.setBreadth(10);
        b.setHeight(15);
        System.out.println("Area of the Box: "+b.surfaceArea()+" and Volume is: "+b.volume());
    }
}