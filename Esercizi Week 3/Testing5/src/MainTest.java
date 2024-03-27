import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @org.junit.jupiter.api.Test
    void testGetYear() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dataPlusOperations = dateTime.plusYears(1).minusMonths(1).plusDays(7);
        String dateForItaly = dataPlusOperations.format(DateTimeFormatter.ofPattern("dd MMMM yyyy").withLocale(Locale.ITALY));
        assertEquals(dateForItaly, "08 febbraio 2024");
    }
}