import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        String dateStringFormattedFull = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        String dateStringFormattedMedium = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        String dateStringFormattedShort = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));

        System.out.println("Data formattata FULL: " + dateStringFormattedFull);
        System.out.println("Data formattata MEDIUM: " + dateStringFormattedMedium);
        System.out.println("Data formattata SHORT: " + dateStringFormattedShort);
    }
}