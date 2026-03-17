class Shape {
    double area;

    // Constructor for Circle
    Shape(double radius) {
        area = Math.PI * radius * radius;
        System.out.println("Shape: Circle");
    }

    // Constructor for Rectangle
    Shape(double length, double width) {
        area = length * width;
        System.out.println("Shape: Rectangle");
    }

    // Constructor for Triangle (dummy parameter for overloading)
    Shape(double base, double height, int dummy) {
        area = 0.5 * base * height;
        System.out.println("Shape: Triangle");
    }

    // Method to display area
    void displayArea() {
        System.out.println("Area: " + area);
        System.out.println("----------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Circle
        Shape circle = new Shape(7);
        circle.displayArea();

        // Rectangle
        Shape rectangle = new Shape(10, 5);
        rectangle.displayArea();

        // Triangle
        Shape triangle = new Shape(6, 4, 1); // dummy value
        triangle.displayArea();
    }
}
