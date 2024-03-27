import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dataPlusOperations = dateTime.plusYears(1).minusMonths(1).plusDays(7);
        String dateForItaly = dataPlusOperations.format(DateTimeFormatter.ofPattern("dd MMMM yyyy").withLocale(Locale.ITALY));

        System.out.println(dateForItaly);
    }
}