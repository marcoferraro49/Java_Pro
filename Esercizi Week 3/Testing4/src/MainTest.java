import java.time.Month;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @org.junit.jupiter.api.Test
    void testGetYear(){
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = dateTime.getYear();
        assertEquals(year, 2023);
    }

    @org.junit.jupiter.api.Test
    void testGetMonth(){
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Month month = dateTime.getMonth();
        assertEquals(month, Month.MARCH);
    }

    @org.junit.jupiter.api.Test
    void testGetDayOfMonth() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int day = dateTime.getDayOfMonth();
        assertEquals(day, 1);
    }
}