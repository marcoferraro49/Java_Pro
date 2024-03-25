import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int dateTimeGetYear = dateTime.getYear();
        Month dateTimeMonth = dateTime.getMonth();
        int dateTimeDay = dateTime.getDayOfMonth();
        DayOfWeek dateTimeDayOfWeek = dateTime.getDayOfWeek();

        System.out.println("Anno: " + dateTimeGetYear);
        System.out.println("Mese: " + dateTimeMonth);
        System.out.println("Giorno: " + dateTimeDay);
        System.out.println("Giorno della settimana: " + dateTimeDayOfWeek);
    }
}