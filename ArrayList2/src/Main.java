import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Studente studente1 = new Studente("Marco", 28);
        Studente studente2 = new Studente("Giovanni", 27);
        Studente studente3 = new Studente("Luca", 26);
        Studente studente4 = new Studente("Francesco", 24);
        Studente studente5 = new Studente("Paolo", 20);
        Studente studente6 = new Studente("Mattia", 19);
        Studente studente7 = new Studente("Gabriele", 24);
        Studente studente8 = new Studente("Daniele", 25);
        Studente studente9 = new Studente("Valentina", 28);
        Studente studente10 = new Studente("Claudia", 29);
        Studente studente11 = new Studente("Francesca", 23);
        Studente studente12 = new Studente("Giovanna", 21);

        ArrayList<Studente> studenti = new ArrayList<>();
        studenti.add(studente1);
        studenti.add(studente2);
        studenti.add(studente3);
        studenti.add(studente4);
        studenti.add(studente5);
        studenti.add(studente6);
        studenti.add(studente7);
        studenti.add(studente8);
        studenti.add(studente9);
        studenti.add(studente10);
        studenti.add(studente11);
        studenti.add(studente12);

        System.out.println(studenti);

        studenti.sort(Comparator.comparing(Studente::getAge));
        System.out.println(studenti);

    }
}