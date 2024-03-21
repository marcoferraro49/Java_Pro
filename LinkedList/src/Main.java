import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Fruit fruit1 = new Fruit("Mela");
        Fruit fruit2 = new Fruit("Pera");
        Fruit fruit3 = new Fruit("Ananas");

        LinkedList<Fruit> fruits = new LinkedList<>();
        fruits.add(fruit1);
        fruits.add(fruit2);
        fruits.add(fruit3);

        System.out.println(fruits);

        Fruit fruit4 = new Fruit("Banana");
        Fruit fruit5 = new Fruit("Kiwi");

        fruits.addFirst(fruit4);
        fruits.addLast(fruit5);

        System.out.println(fruits);
    }
}