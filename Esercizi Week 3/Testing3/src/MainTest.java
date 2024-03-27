import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void testLongData(){
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String longFormat = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        assertEquals(longFormat, "1 marzo 2023");
    }
}