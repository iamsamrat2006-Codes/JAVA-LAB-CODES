//SAMRAT_MUKHERJEE
//WAP IN JAVA to Create a Circle class with radius, a constructor, and methods for area and circumference.

class Circle {
    double radius;

    // Constructor to initialize radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double circumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircleClass_12 {
    public static void main(String[] args) {

        // Create Circle object using constructor
        Circle c = new Circle(7);

        // Display area and circumference
        System.out.println("Area = " + c.area());
        System.out.println("Circumference = " + c.circumference());
    }
}