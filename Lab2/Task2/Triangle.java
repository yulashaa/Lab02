public class Triangle implements Figure {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double calculateArea() {
        return this.side * this.height / 2.0;
    }
}
