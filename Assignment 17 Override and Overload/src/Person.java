public class Person {
    private int age;
    private String name;
    void setPerson(String name){
        this.name=name;
    }
    void setPerson(int age){
        this.age=age;
    }
    void setPerson(int age, String name){
        this.name=name;
        this.age=age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void showName(){
        System.out.println("Name: "+this.name);
    }
    public void showName(String salutation){
        System.out.println("Name: "+salutation+" "+this.name);
    }
}