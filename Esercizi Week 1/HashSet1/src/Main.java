import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        riempiHashset(hashSet);
        System.out.println("L'hashset è: " + hashSet);
        System.out.println("La grandezza dell'hashset è: " + hashSet.size());
        for (Integer element : hashSet){
            System.out.println("Elementi dell'hashset: " + element);
        }
    }

    public static void riempiHashset(Set<Integer> hashSet){
        int i=1;
        while(i<5) {
            hashSet.add(i);
            i++;
        }
    }
}