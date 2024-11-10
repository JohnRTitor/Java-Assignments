import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of Box class
class Box {
    // instance variables of the Box class
    int length;
    int breadth;
    int height;

    // constructor to initialize the instance variables
    Box (int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // method to calculate the volume of the box
    int volume () {
        return this.length * this.breadth * this.height;
    }
}

// Start of driver class
class BoxDriver {
    // Start of main() method
    public static void main(String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        // Get box dimensions from user
        System.err.print("Enter length of the box: ");
        int length = sc.nextInt();
        System.err.print("Enter breadth of the box: ");
        int breadth = sc.nextInt();
        System.err.print("Enter height of the box: ");
        int height = sc.nextInt();

        // Create a Box object with the given dimensions
        Box box1 = new Box(length, breadth, height);
        // Print the volume of the box
        System.out.println("Volume of the box is: " + box1.volume());
    }
    // End of main() method
}
// End of driver class
