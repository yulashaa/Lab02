public class Pyramid implements Figure3D {
    private double side;
    private double height;

    public Pyramid(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double calculateArea() {
        return this.side * this.side + 2.0 * this.height * this.side;
    }

    public double calculateVolume() {
        return this.side * this.side * this.height / 3.0;
    }
}
