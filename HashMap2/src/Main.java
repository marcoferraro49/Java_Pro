import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> mappa = new HashMap<>();
        mappa.put(4, "Quattro");
        mappa.put(2, "Due");
        mappa.put(3, "Tre");
        mappa.put(1, "Uno");

        Collection<Integer> chiavi = mappa.keySet();
        List<Integer> chiaviOrdinate = new ArrayList<>(chiavi);
        Collections.sort(chiaviOrdinate);

        System.out.println("Le chiavi ordinate sono: " + chiaviOrdinate);
    }
}