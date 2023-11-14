public class Employee extends Person{
    private int Salary;
    public Employee(){
        this(100000);
    }
    public Employee(int salary){
        this.Salary=salary;
    }
    public void employeeData(){
        System.out.println("Name: "+super.name+"\nAge: "+super.age+"\nSalary: "+this.Salary);
    }
}
