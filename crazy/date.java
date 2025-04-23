package crazy;
import java.time.LocalDate;// this import the class fro detecting the curr date 
// LocalTime for time 
// LocalDateTime  fro both
public class date {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();// it creates a date object for grtting current date
        System.out.println(date);
    }
}
