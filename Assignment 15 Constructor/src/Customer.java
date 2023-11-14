class Customer {
private int id;
private long mobile;
private String name, email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    Customer(int id, String name, long mobile, String email){
        this.id=id;
        this.mobile=mobile;
        this.email=email;
        this.name=name;
    }
    Customer(int id,String name, long mobile){
        this.id=id;
        this.mobile=mobile;
        this.name=name;
    }
}
