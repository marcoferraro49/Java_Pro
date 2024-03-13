import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<String> hashSet = riempiHashset();
        System.out.println(hashSet);
        String x = "2";
        for (String element : hashSet){
            if(element == x){
                System.out.println("Elemento " + element + " già presente nell'hashset");
            }
        }
    }

    public static HashSet<String> riempiHashset(){
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");

        return hashSet;
    }
}