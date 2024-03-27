import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();

        String fullFormat = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        String mediumFormat = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        String shortFormat = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));

        System.out.println("Data: " + dateTime);
        System.out.println("Data Full: " + fullFormat);
        System.out.println("Data Medium: " + mediumFormat);
        System.out.println("Data Short: " + shortFormat);

    }
}