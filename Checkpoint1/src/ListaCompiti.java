public class ListaCompiti {

    private Compito[] compiti = new Compito[3];
    private int numCompiti = 0;

    public ListaCompiti() {
    }

    public Compito[] getCompiti() {
        return compiti;
    }

    public void setCompiti(Compito[] compiti) {
        this.compiti = compiti;
    }

    public void aggiungiCompito (Compito compito){
        if(numCompiti < compiti.length) {
            for (int i = 0; i < compiti.length; i++) {
                if (compiti[i] == null) {
                    compiti[i] = compito;
                    numCompiti++;
                    break;
                }
            }
        } else {
            System.out.println("La lista è piena, non è possibile aggiungere nuovi compiti");
        }
    }

    public void rimuoviCompito (Compito compito){
        for (int i = 0; i < compiti.length; i++){
            if(compiti[i] == compito){
                compiti[i] = null;
                numCompiti--;
                break;
            }
        }
    }

    public void visualizzaCompiti (){
        for (int i = 0; i < compiti.length; i++){
            if(compiti[i] != null){
                System.out.println(compiti[i]);
            }
        }
    }

    public void searchByState (Stato x){
        for (int i = 0; i < compiti.length; i++){
            if (compiti[i] != null){
                if (compiti[i].getStato().equals(x)){
                    System.out.println(compiti[i]);
                }
            }
        }
    }
}
