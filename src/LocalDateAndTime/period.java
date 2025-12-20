package LocalDateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class period {

    public static void main(String[] args) {
        LocalDate mine= LocalDate.of(2005,10,13);
        LocalDate today=LocalDate.now();

        Period p = Period.between(mine,today);
        System.out.println(p.getYears());
        System.out.println(p.getMonths());

    }

}
