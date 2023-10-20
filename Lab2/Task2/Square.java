public class Square implements Figure {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return this.side * this.side;
    }
}
