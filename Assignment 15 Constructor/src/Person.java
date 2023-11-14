class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Person(){

    }
    Person(int age){
        setAge(age);
    }
    Person(String name){
        setName(name);
    }
    Person(String name, int age){
        setName(name);
        setAge(age);
    }
}
