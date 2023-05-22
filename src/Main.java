import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int arraySize = 1;
        Shape[] shapes = new Shape[arraySize];

        for(int i = 0; i< arraySize;i++) {

            Circle circle = new Circle();
            circle.paint("Black");
            System.out.println("\nPerimeter of Circle: " + circle.calculatePerimeter());
            System.out.println("Area of Circle: " + circle.calculateArea());
            System.out.println(circle.toString());
            System.out.println("Result of hashcode: " + circle.hashcode());


            Rectangle rectangle = new Rectangle();
            rectangle.paint("White");
            System.out.println("\nPerimeter of Rectangle: " + rectangle.calculatePerimeter());
            System.out.println("Area of Rectangle: " + rectangle.calculateArea());
            System.out.println(rectangle.toString());
            System.out.println("Result of hashcode: " + rectangle.hashCode());

            Triangle triangle = new Triangle();
            triangle.paint("Grey");
            System.out.println("\nPerimeter of Triangle: " + triangle.calculatePerimeter());
            System.out.println("Area of Triangle: " + triangle.calculateArea());
            System.out.println(triangle.toString());
            System.out.println("Result of hashcode: " + triangle.hashCode());
        }
    }
}




