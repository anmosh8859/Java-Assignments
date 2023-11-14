public class Main {
    public static void main(String[] args) {
        Person p1=new Person();
        System.out.println("Name in P1: "+p1.getName());
        System.out.println("Age in P1: "+p1.getAge());
        Person p2=new Person(25);
        System.out.println("Name in P2: "+p2.getName());
        System.out.println("Age in P2: "+p2.getAge());
        Person p3= new Person("The Anand M Sharma");
        System.out.println("Name in P3: "+p3.getName());
        System.out.println("Age in P3: "+p3.getAge());
        Person p4=new Person("The Anand M Sharma",25);
        System.out.println("Name in P4: "+p4.getName());
        System.out.println("Age in P4: "+p4.getAge());

        Employee e1=new Employee();
        System.out.println("EmpId of e1: "+e1.getEmpId());
        System.out.println("Name of e1: "+e1.getName());
        System.out.println("Salary of e1: "+e1.getSalary());
        Employee e2=new Employee("The Anand M Sharma",110000);
        System.out.println("EmpId of e2: "+e2.getEmpId());
        System.out.println("Name of e2: "+e2.getName());
        System.out.println("Salary of e2: "+e2.getSalary());

        Box b1=new Box();
        System.out.println("Length of b1: "+b1.getLength());
        System.out.println("Breadth of b1: "+b1.getBreadth());
        System.out.println("Height of b1: "+b1.getHeight());
        Box b2=new Box(30);
        System.out.println("Length of b2: "+b2.getLength());
        System.out.println("Breadth of b2: "+b2.getBreadth());
        System.out.println("Height of b2: "+b2.getHeight());
        Box b3=new Box(10,20,30);
        System.out.println("Length of b3: "+b3.getLength());
        System.out.println("Breadth of b3: "+b3.getBreadth());
        System.out.println("Height of b3: "+b3.getHeight());

        Time t1, t2, t3;
        t1= new Time();
        System.out.println("Time at t1, hr: "+t1.getHr()+" min: "+t1.getMin()+" sec: "+t1.getSec());
        t2= new Time(10);
        System.out.println("Time at t2, hr: "+t2.getHr()+" min: "+t2.getMin()+" sec: "+t2.getSec());
        t3=new Time(10,20,30);
        System.out.println("Time at t3, hr: "+t3.getHr()+" min: "+t3.getMin()+" sec: "+t3.getSec());

        Customer c1,c2;
        c1 = new Customer(1234, "The Anand M Sharma", 8_859_490_148L, "anandmsharma786@gmai.com");
        System.out.println("Id of c1: "+c1.getId());
        System.out.println("Name of c1: "+c1.getName());
        System.out.println("Mobile No. of c1: "+c1.getMobile());
        System.out.println("Email of c1: "+c1.getEmail());
        c2=new Customer(12345,"The Anand M Sharma",8859490148L);
        System.out.println("Id of c2: "+c2.getId());
        System.out.println("Name of c2: "+c2.getName());
        System.out.println("Mobile No. of c2: "+c2.getMobile());

    }
}