public class Main {
    public static void main(String[] args) {
        Person P=new Person("Anand",25);
        System.out.println("Name: "+P.name+" and his age: "+P.age);
        Circle C=new Circle();
        System.out.println("Area: "+C.getArea());
        Employee e=new Employee();
        e.employeeData();
    }
}