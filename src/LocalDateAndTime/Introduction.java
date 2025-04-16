package LocalDateAndTime;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Introduction {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate updated = date.plusDays(10);
        System.out.println(updated);

        LocalDate mine = LocalDate.of(2005,10,13);
        System.out.println(mine);

        //converting date and time to string
        DateTimeFormatter formated = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String converted = date.format(formated);
        System.out.println(converted);

        //converting string into date
        LocalDate parsed = LocalDate.parse(converted,formated);
        System.out.println(parsed);

        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
}
