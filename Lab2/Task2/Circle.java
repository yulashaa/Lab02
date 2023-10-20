public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
