public class Time {
    int hour, minute, second;
    void setTime(int h, int m, int s){
        hour=h;
        minute=m;
        second=s;
    }
    void showTime(){
        System.out.println(hour+" hr "+minute+" min "+second+" sec ");
    }
    public static void main(String[] args) {
        Time t=new Time();
        t.setTime(3,45,20);
        t.showTime();
    }
}
