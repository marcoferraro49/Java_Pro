public class ShapeFactory {

    public Shape creteShape (ShapeType shapeType){
        Shape shape = switch (shapeType) {
            case CERCHIO -> new Cerchio();
            case RETTANGOLO -> new Rettangolo();
        };
        return shape;
    }
}
