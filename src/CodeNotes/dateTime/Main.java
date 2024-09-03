package CodeNotes.dateTime;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh-mm-ss");
        System.out.println(time.format(dtf));

//        DateTimeFormatter dt = DateTimeFormatter.ofPattern("HH-mm");
//        System.out.println(time.format(dt));
//
//        System.out.println(time.getHour());
//        System.out.println(time.getMinute());
//        System.out.println(time.getSecond());

        ZoneId zia = ZoneId.of("America/New_York");
        LocalTime America_ld = LocalTime.now(zia);
        System.out.println(America_ld);


        LocalTime ind_ld = LocalTime.now();
        System.out.println(ind_ld);

        System.out.println(ChronoUnit.HOURS.between(ind_ld,America_ld));

    }
}
