import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Studente studente1 = new Studente("Marco", 28);
        Studente studente2 = new Studente("Giovanni", 24);
        Studente studente3 = new Studente("Luca", 25);
        Studente studente4 = new Studente("Francesco", 29);

        ArrayList<Studente> studenti = new ArrayList<>();
        System.out.println(studenti);

        studenti.add(studente1);
        studenti.add(studente2);
        studenti.add(studente3);
        studenti.add(studente4);

        System.out.println(studenti);
    }
}