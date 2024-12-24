import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of the Cube class
class Cube {
    // instance variable of the Cube class
    double side;

    // constructor to initialize the instance variable
    Cube(double side) {
        this.side = side;
    }
    // end of constructor

    // method to calculate the volume of the cube
    double getVolume() {
        return side * side * side;
    }
    // end of getVolume() method
}

// Start of the Cylinder class inheriting from the Cube class
class Cylinder extends Cube {
    // ++ extra instance variable of the Cylinder class
    double height;

    // constructor to initialize the instance variables
    Cylinder(double side, double height) {
        super(side);
        this.height = height;
    }
    // end of constructor

    // method to calculate the volume of the cylinder
    @Override
    double getVolume() {
        return Math.PI * side * side * height;
    }
    // end of getVolume() method
}
// end of Cylinder class

// Start of the CylinderDriver class
class CylinderDriver {
    // Start of main() method
    public static void main(String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        // Get the side of the cube
        System.out.print("Enter the side length of the cube: ");
        double cubeSide = sc.nextDouble();
        Cube cube1 = new Cube(cubeSide);

        // Get the radius and height of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double cylinderRadius = sc.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double cylinderHeight = sc.nextDouble();
        Cylinder cylinder1 = new Cylinder(cylinderRadius, cylinderHeight);

        // print the volume of the cube and cylinder
        System.out.println("Volume of Cube: " + cube1.getVolume());
        System.out.println("Volume of Cylinder: " + cylinder1.getVolume());

        // close the Scanner
        sc.close();
    }
    // end of main() method
}
// end of CylinderDriver class
