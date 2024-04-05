public class Main {
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.creteShape(ShapeType.CERCHIO);
        Shape rectangle = factory.creteShape(ShapeType.RETTANGOLO);

        circle.draw();
        rectangle.draw();
    }
}