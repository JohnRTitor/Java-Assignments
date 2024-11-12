import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of MyPoint class
class MyPoint {
    // instance variables of the MyPoint class
    int x;
    int y;

    // zero argument constructor
    MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    // end of zero argument constructor

    // overloaded two argument constructor
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // end of overloaded constructor

    // method to set the x and y coordinates manually
    void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // end of setXY() method

    // method to get the x and y coordinates into an integer array
    int[] getXY() {
        int[] arr = { this.x, this.y };
        return arr;
    }
    // end of getXY() method

    // method to return the x and y coordinates as a structured string
    String toStructuredString() {
        return "(" + this.x + ", " + this.y + ")";
    }
    // end of toStructuredString() method

    // method to calculate the distance between two points
    double distance(int x, int y) {
        // euclidean distance formula
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
    // end of distance() method
}

// Start of driver class
class TestMyPoint {
    // Start of main() method
    public static void main(String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        // Get point A and B from user
        System.out.print("Enter point A: ");
        int xa = sc.nextInt();
        int ya = sc.nextInt();
        MyPoint a = new MyPoint();
        a.setXY(xa, ya);

        System.out.print("Enter point B: ");
        int xb = sc.nextInt();
        int yb = sc.nextInt();
        MyPoint b = new MyPoint(xb, yb);

        // Set point C to origin
        System.out.println("Assuming point C is origin...");
        MyPoint c = new MyPoint();

        // Print the point coordinates
        System.out.println("Point A: " + a.toStructuredString());
        int[] bcords = b.getXY();
        System.out.println("Point B: (" + bcords[0] + ", " + bcords[1] + ")");
        System.out.println("Point C: " + c.toStructuredString());

        // Print the distance between the points
        System.out.println("Distance between A and B: " + a.distance(b.x, b.y));
        System.out.println("Distance between B and C: " + b.distance(c.x, c.y));
        System.out.println("Distance between C and A: " + c.distance(a.x, a.y));
    }
    // End of main() method
}
// End of driver class
