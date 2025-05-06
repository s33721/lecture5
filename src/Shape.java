public abstract class Shape {

    private String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Getter
    public String getColor() {
        return color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public String getInfo() {
        return "Shape with color " + color + ", area: " + calculateArea() +
                ", perimeter: " + calculatePerimeter();
    }
}