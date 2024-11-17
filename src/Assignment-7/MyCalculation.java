import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of Calculator class
class Calculator {
    // instance variables of the Calculator class
    int x;
    int y;

    // method to perform addition
    void addition () {
        System.out.println(this.x + " + " + this.y + " : " + (this.x + + this.y));
    }
    // end of addition() method

    // method to perform subtraction
    void subtraction () {
        System.out.println(this.x + " - " + this.y + " : " + (this.x - + this.y));
    }
    // end of subtraction() method

    // method to perform multiplication
    void multiplication () {
        System.out.println(this.x + " * " + this.y + " : " + (this.x * + this.y));
    }
    // end of multiplication() method

    // method to perform division
    void division () {
        // check if the denominator is zero
        if (this.y == 0) {
            // print an error message and return if true
            System.out.println("Division by zero is not possible");
            return;
        }
        // print the division result otherwise
        System.out.println(this.x + " / " + this.y + " : " + ((double) this.x / + this.y));
    }
    // end of division() method
}
// end of Calculator class

// Start of MyCalculator class
class MyCalculator extends Calculator {
    // static method to square a number
    static void square (int x) {
        System.out.println(x + "^2: " + (x * x));
    }
    // end of square() method
}
// end of MyCalculator class

// driver class
class MyCalculation {
    // Start of main() method
    public static void main(String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        // Get the values of x and y from the user
        // and create a MyCalculator object
        MyCalculator myCalc = new MyCalculator();
        System.out.print("Enter the values of x and y: ");
        myCalc.x = sc.nextInt();
        myCalc.y = sc.nextInt();

        // perform the arithmetic operations
        myCalc.addition();
        myCalc.subtraction();
        myCalc.multiplication();
        myCalc.division();

        // Get the value of z from the user and square it
        System.out.print("Which number do you want to square? ");
        int z = sc.nextInt();
        MyCalculator.square(z);
    }
    // end of main() method
}
// end of MyCalculation class
