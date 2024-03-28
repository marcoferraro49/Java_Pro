import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(getYear(dateTime));
        System.out.println(getMonth(dateTime));
        System.out.println(getDay(dateTime));
    }

    public static int getYear(OffsetDateTime date){
        return date.getYear();
    }

    public static Month getMonth (OffsetDateTime date){
        return date.getMonth();
    }

    public static int getDay(OffsetDateTime date){
        return date.getDayOfMonth();
    }
}