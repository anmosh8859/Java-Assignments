public class Employee {
    int empld, salary;
    String name;
    void setter(int e, String n, int s){
        empld=e;
        name=n;
        salary=s;
    }
    void getter(){
        System.out.println("Employee Id: "+empld);
        System.out.println("Name: "+name);
        System.out.println("Salary:  "+salary);
    }

    public static void main(String[] args) {
        Employee e=new Employee();
        e.setter(1234,"The Anand M Sharma", 5400);
        e.getter();
    }
}
