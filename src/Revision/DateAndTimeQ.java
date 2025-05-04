package Revision;

import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateAndTimeQ {
    public static void main(String[] args) {

     LocalDateTime date= LocalDateTime.now();

        DateTimeFormatter formated = DateTimeFormatter.ofPattern("MM-yyyy-dd HH:mm:ss ");
        System.out.println(date.format(formated));

        LocalDateTime added = date.plusDays(7).plusHours(5).plusMinutes(30);
        System.out.println(added.format(formated));
    }
}
