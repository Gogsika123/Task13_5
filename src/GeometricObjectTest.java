public class GeometricObjectTest {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(5.2);
        GeometricObject circle2 = new Circle(2.0);
        GeometricObject rectangle1 = new Rectangle(4.0, 5.8);
        GeometricObject rectangle2 = new Rectangle(4.1, 8.0);
        GeometricObject largerCircle = GeometricObject.max(circle1, circle2);
        GeometricObject largerRectangle = GeometricObject.max(rectangle1, rectangle2);
        System.out.println("Larger circle: Area = " + largerCircle.getArea());
        System.out.println("Larger rectangle: Area = " + largerRectangle.getArea());
    }
}