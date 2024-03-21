import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Studente studente1 = new Studente("Marco", 28);
        Studente studente2 = new Studente("Luca", 27);
        Studente studente3 = new Studente("Giovanni", 29);

        //Metodo 1 di inizializzazione
        Map<String, Studente> mappa = new HashMap<>();
        mappa.put("Studente 1", studente1);
        mappa.put("Studente 2", studente2);
        mappa.put("Studente 3", studente3);
        System.out.println("Mappa 1: " + mappa);

        //Metodo 2 di inizializzazione
        Map<String, Studente> mappa2 = Map.of("Studente 1", studente1, "Studente 2", studente2, "Studente 3", studente3);
        System.out.println("Mappa 2: " + mappa2);

        //Metodo 3 di inizializzazione
        Map<String, Studente> mappa3 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Studente 1", studente1),
                new AbstractMap.SimpleEntry<>("Studente 2", studente2),
                new AbstractMap.SimpleEntry<>("Studente 3", studente3)
        );
        for (Map.Entry<String, Studente> element : mappa3.entrySet()){
            System.out.println(element);
        }
    }
}