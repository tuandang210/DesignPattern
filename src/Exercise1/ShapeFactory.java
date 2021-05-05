package Exercise1;

public class ShapeFactory {
    public static Shape getShape(String type) {
        Shape shape = null;
        switch (type) {
            case "Circle":
                shape = new Circle();
                break;
            case "Rectangle":
                shape = new Rectangle();
                break;
            case "Square":
                shape = new Square();
                break;
            default:
                System.out.println("Nhập sai");
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return shape;
    }
}
