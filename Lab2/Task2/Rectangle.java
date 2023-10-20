public class Rectangle implements Figure {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double calculateArea() {
        return this.side1 * this.side2;
    }
}
