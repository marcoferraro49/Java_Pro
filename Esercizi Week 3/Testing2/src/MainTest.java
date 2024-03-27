
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void testFullData(){
        ZonedDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        String fullFormat = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        assertEquals(fullFormat, "venerdì 1 marzo 2002 13:00:00 Z");
    }

    @org.junit.jupiter.api.Test
    void testMediumData(){
        ZonedDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        String mediumFormat = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        assertEquals(mediumFormat, "1 mar 2002, 13:00:00");
    }

    @org.junit.jupiter.api.Test
    void testShortData(){
        ZonedDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        String shortFormat = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        assertEquals(shortFormat, "01/03/02, 13:00");
    }

}