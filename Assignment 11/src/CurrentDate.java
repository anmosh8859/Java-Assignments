import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CurrentDate{
    public static void main(String[] args) {
        LocalDateTime t=LocalDateTime.now();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("DD");
        System.out.println("Current Date: "+f.format(t));
    }
}
