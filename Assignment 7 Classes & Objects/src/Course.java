public class Course {
    private int courseId, duration, fee;
    private String courseName;
    void setDetails(int i, String n, int d, int f){
        courseId=i;
        courseName=n;
        duration=d;
        fee=f;
    }
    void showDetails(){
        System.out.println("Course Id: "+courseId);
        System.out.println("Course Name: "+courseName);
        System.out.println("Duration: "+duration+" Months");
        System.out.println("Fee: "+fee+" Rupees");
    }
    public static void main(String[] args) {
        Course c= new Course();
        c.setDetails(1,"Java", 3, 2400);
        c.showDetails();
    }
}
