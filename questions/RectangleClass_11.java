//SAMRAT_MUKHERJEE
//WAP IN JAVA to Create a Rectangle class with length and breadth and methods for area and perimeter.

//Use an object in main().


class Rectangle {
    double length;
    double breadth;

    // Constructor to initialize length and breadth
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    double area() {
        return length * breadth;
    }

    // Method to calculate perimeter
    double perimeter() {
        return 2 * (length + breadth);
    }
}

public class RectangleClass_11 {
    public static void main(String[] args) {

        // Create Rectangle object
        Rectangle r = new Rectangle(10, 5);

        // Display area and perimeter
        System.out.println("Area = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
    }
}