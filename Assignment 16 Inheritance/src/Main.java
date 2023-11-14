import Customer.Customer;
public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setName("The Anand M Sharma");
        System.out.println("Name of e1: "+e1.getName());
        e1.setAge(25);
        System.out.println("Age of e1: "+e1.getAge());
        e1.setSalary(110000);
        System.out.println("Age of e1: "+e1.getSalary());
        Customer c= new Customer();
        System.out.println("The account balance now: "+c.checkBalance());
        c.deposit(45000.95);
        c.withdraw(1000.25);
        System.out.println("The account balance now: "+c.checkBalance());
        ThickCircle t= new ThickCircle(4,3);
        System.out.println("The thickness area of circle: "+t.thicknessArea()+" and area of hollow space: "+t.areaHollowSpace());
        DetailedContacts d=new DetailedContacts();
        d.setName("The Anand M Sharma");
        d.setEmail("anandmsharma786@gmail.com");
        d.setDateOfBirth("10-07-1997");
        d.setMobile(8859490148L);
        System.out.println("Name: "+d.getName()+"\nEmail: "+d.getEmail()+"\nDate of Birth: "+d.getDateOfBirth()+"\nMobile Number: "+d.getMobile());
    }
}