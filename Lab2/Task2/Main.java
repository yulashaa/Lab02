public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(2.0, 3.0);
        Square square = new Square(2.5);
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        Cube cube = new Cube(5.0);
        Pyramid pyramid = new Pyramid(1.0, 5.0);
        Circle circle = new Circle(4.0);
        Sphere sphere = new Sphere(6.0);
        System.out.println("Area of the triangle: " + triangle.calculateArea());
        System.out.println("Area of the square: " + square.calculateArea());
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Area of the cube: " + cube.calculateArea() + ", volume of the cube: " + cube.calculateVolume());
        System.out.println("Area of the pyramid: " + pyramid.calculateArea() + ", volume of the pyramid: " + pyramid.calculateVolume());
        System.out.println("Area of the sphere: " + sphere.calculateArea() + ", volume of the sphere: " + sphere.calculateVolume());
    }
}