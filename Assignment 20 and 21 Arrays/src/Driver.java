import java.util.Scanner;

public class Driver {
    public static Employee[] sortSalary(Employee emp[]){
        for(int i=0;i< emp.length;i++){
            int j;
            for (j=i+1;j<emp.length;j++){
                if(emp[i].getSalary()>emp[j].getSalary()){
                    Employee e=emp[i];
                    emp[i]=emp[j];
                    emp[j]=e;
                }
            }
        }
        return emp;
    }
    public static Employee[] sortName(Employee emp[]){
        for(int i=0;i< emp.length;i++){
            int j;
            for (j=i+1;j<emp.length;j++){
                if(emp[i].getName().compareTo(emp[j].getName())>0){
                    Employee e=emp[i];
                    emp[i]=emp[j];
                    emp[j]=e;
                }
            }
        }
        return emp;
    }
    public static void driver(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Employees profile you want to create: ");
        int no=sc.nextInt();
        Employee emp[]= new Employee[no];
        System.out.println("Enter the details of Employees, i.e., id, name, salary");
        for (int i=0;i< emp.length;i++)
            emp[i]=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
        for (Employee e:emp)
            System.out.println("Employee Details: "+e.getId()+" "+e.getName()+" "+e.getSalary());
        emp=sortSalary(emp);
        for (Employee e:emp)
            System.out.println("Employee Details(Sorted according to the salary): "+e.getId()+" "+e.getName()+" "+e.getSalary());
        emp=sortName(emp);
        for (Employee e:emp)
            System.out.println("Employee Details(Sorted according to the Name): "+e.getId()+" "+e.getName()+" "+e.getSalary());
    }
}
class Employee {
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Employee(int id,String name,double salary){
        setId(id);
        setName(name);
        setSalary(salary);
    }
}
