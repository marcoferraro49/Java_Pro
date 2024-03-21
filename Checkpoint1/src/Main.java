/*
### Esercizio 3:
**Traccia:**
Scrivi un programma per gestire una lista di compiti da fare. Ogni compito dovrebbe avere una descrizione e uno stato
(in corso, completato, o in sospeso). Implementa un sistema per aggiungere nuovi compiti, visualizzare tutti i compiti e
filtrare i compiti per stato. Utilizza un array per memorizzare le informazioni sui compiti.
**Suggerimenti:**
1. Definisci una classe `Compito` che rappresenti un compito con attributi come descrizione e stato.
2. Implementa una classe `ListaCompiti` che gestisca i compiti utilizzando un array per memorizzare le informazioni
(La lista può contenere al massimo 1000 compiti).
3. Alla lista dei compiti è possibile aggiungere un Compito
4. La lista dei compiti deve essere in grado di mostrare tutti i compiti presenti.
### Bonus
5. Aggiungi la funzionalità di filtraggio dei compiti per stato (in corso, completato, o in sospeso).
 */

public class Main {
    public static void main(String[] args) {

        Compito compito1 = new Compito("Spesa", Stato.IN_CORSO);
        Compito compito2 = new Compito("Comprare GPU", Stato.IN_SOSPESO);
        Compito compito3 = new Compito("Pallavolo", Stato.IN_CORSO);

        ListaCompiti lista = new ListaCompiti();
        lista.aggiungiCompito(compito1);
        lista.aggiungiCompito(compito2);
        lista.aggiungiCompito(compito3);


        lista.visualizzaCompiti();
        System.out.println("Output dopo la ricerca");
        lista.searchByState(Stato.IN_CORSO);



        lista.rimuoviCompito(compito2);
        System.out.println("Output dopo la rimozione");
        lista.visualizzaCompiti();

        System.out.println("Output dopo l'aggiunta");
        lista.aggiungiCompito(compito2);
        lista.visualizzaCompiti();

        Compito compito4 = new Compito("Comprare altre cose", Stato.COMPLETATO);
        lista.aggiungiCompito(compito4);
        lista.visualizzaCompiti();
    }
}