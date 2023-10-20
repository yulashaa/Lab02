public class Cube implements Figure3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return 6.0 * this.side * this.side;
    }

    public double calculateVolume() {
        return this.side * this.side * this.side;
    }
}
