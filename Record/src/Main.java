public class Main {
    public static void main(String[] args) {

        Coordinate coordinate = new Coordinate(2, 3);

        System.out.println("X: " + coordinate.x());
        System.out.println("Y: " + coordinate.y());
        System.out.println(coordinate);

        Coordinate coordinate1 = new Coordinate(2, 3);
        System.out.println("Coordinate 1 è uguale a coordinate? " + coordinate.equals(coordinate1));
    }
}