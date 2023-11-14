public class Contact {
    int id,mobileNo;
    String firstName, lastName, emailId;
    void setter(int i, int m, String f, String l, String e){
        firstName=f;
        lastName=l;
        emailId=e;
        id=i;
        mobileNo=m;
    }
    void getter(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+firstName+" "+lastName);
        System.out.println("Mobile No.: "+mobileNo);
        System.out.println("E-Mail Id: "+emailId);
    }

    public static void main(String[] args) {
        Contact c= new Contact();
        c.setter(123,94124588,"Narendra", "Sharma", "ns012sharma786@gmail.com");
        c.getter();
    }
}
