public class Sphere implements Figure3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 12.566370614359172 * this.radius * this.radius;
    }

    public double calculateVolume() {
        return 12.566370614359172 * this.radius * this.radius * this.radius / 3.0;
    }
}
