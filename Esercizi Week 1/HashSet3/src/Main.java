import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<String> hashSet = riempiHashSet();
        System.out.println(hashSet);
        String x = "2";

        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            if(element == x){
                iterator.remove();
            }
        }
        System.out.println("Il nuovo hashset è: " + hashSet);
        hashSet.clear(); //svuoto l'HashSet
    }

    public static HashSet<String> riempiHashSet (){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        return hashSet;
    }
}