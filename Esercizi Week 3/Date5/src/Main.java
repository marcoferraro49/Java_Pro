import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dateTime2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        boolean dataTimePrecedente = dateTime.isBefore(dateTime2);
        boolean secondaDataSuccessiva = dateTime2.isAfter(dateTime);
        boolean sonoUguali = dateTime.isEqual(dateTime2);

        System.out.println("dataTime è precedente a dataTime2 ? " + dataTimePrecedente);
        System.out.println("dataTime2 è successiva a dataTime ? " + secondaDataSuccessiva);
        System.out.println("Le due date sono uguali ? " + sonoUguali);

    }
}