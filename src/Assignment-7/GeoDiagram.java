import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of the Rectangle class
class Rectangle {
    // instance variables of the Rectangle class
    double length;
    double breadth;

    // constructor to initialize the instance variables
    Rectangle (double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    // end of constructor

    // method to calculate the area of the rectangle
    double area() {
        return 2 * (this.length + this.breadth);
    }
    // end of area() method
}
// end of Rectangle class

// Start of the Square class
// inherited from the Rectangle class
class Square extends Rectangle {
    // constructor to initialize the instance variables
    Square (double side) {
        // call the constructor of the parent class
        super(side, side);
    }
    // end of constructor
}
// end of Square class

// Start of the GeoDiagram driver class
class GeoDiagram {
    // Start of main() method
    public static void main(String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        // Get the length and breadth of the rectangle
        System.out.print("Enter the length and breadth of the rectangle R: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        Rectangle r = new Rectangle(length, breadth);

        // Get the side of the square
        System.out.print("Enter the side of the square S: ");
        double side = sc.nextDouble();
        Square s = new Square(side);

        // print the area of the rectangle and square
        System.out.println("Area of the rectangle R is: " + r.area() + "units");
        System.out.println("Area of the square S is: " + s.area() + "units");
    }
    // end of main() method
}
// end of GeoDiagram class
