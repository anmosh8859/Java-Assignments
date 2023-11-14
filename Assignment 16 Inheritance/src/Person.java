class Person {
    private String name;
    private int age;
    protected void setName(String name){
        this.name=name;
    }
    protected void setAge(int age){
        this.age=age;
    }
    protected String getName(){
        return name;
    }
    protected int getAge(){
        return age;
    }
}
class Employee extends Person{
    double salary;
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
