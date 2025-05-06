public class TestShapes {
    public static void main(String[] args) {
        // Array of shapes
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red", 5);
        shapes[1] = new Rectangle("blue", 4, 6);
        shapes[2] = new Circle("green", 3);

        // Iteration through all shapes
        for (Shape s : shapes) {
            System.out.println(s.getInfo());
            System.out.println("Details: area = " + s.calculateArea() +
                    ", perimeter = " + s.calculatePerimeter());
            System.out.println();
        }
    }
}