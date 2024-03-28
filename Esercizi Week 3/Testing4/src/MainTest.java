import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void getYear() {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = date.getYear();
        assertEquals(year, 2023);
    }

    @Test
    void getMonth() {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Month month = date.getMonth();
        assertEquals(month, Month.MARCH);
    }

    @Test
    void getDay() {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int day = date.getDayOfMonth();
        assertEquals(day, 1);
    }
}