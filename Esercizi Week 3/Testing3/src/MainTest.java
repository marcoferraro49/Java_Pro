import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void formatDate() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String date = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        assertEquals(date, "1 marzo 2023");
    }
}