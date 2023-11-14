import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CurrentTime {
    public static void main(String[] args) {
        LocalDateTime t=LocalDateTime.now();
        System.out.println("Time: "+t);
    }
}
