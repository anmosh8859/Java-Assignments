import java.util.Scanner;
class Employee {
    private int empid;
    private float salary;
    private String name;
    private static int value=0;
    Employee(){
        Scanner sc=new Scanner(System.in);
        Employee.value++;
        System.out.println("Enter the Name of the employee: ");
        setName(sc.nextLine());
        System.out.println("Enter the salary: ");
        setSalary(sc.nextFloat());
        generateEmpID();
    }

    private void setSalary(float nextFloat) {
        this.salary=nextFloat;
    }

    Employee(String name,float salary){
        Employee.value++;
        setName(name);
        setSalary(salary);
        generateEmpID();
    }
    private void generateEmpID(){
        this.empid=Employee.value;
    }
    public int getEmpId() {
        return empid;
    }

    public float getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
