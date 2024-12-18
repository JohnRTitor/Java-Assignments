import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of TriangleOfStarAndZeros class
class TriangleOfStarAndZeros {
    // Start of main() method
    public static void main (String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rows to print? ");
        // reading a number from standard input
        int rows = sc.nextInt();

        if (rows < 1) {
            // show an error, if user enters invalid input
            System.out.println("Error: No of rows must be positive.");
            return;
        }

        // Loop to print all rows, one by one
        for (int i = 1; i <= rows; i++) {
            // First half of the row
            // if the row number is even, print 0, else print *
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
            // Second half of the row
            // if the row number is even, print 0, else print *
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }
            // Move to the next row by printing a newline
            System.out.println();
        }
    }
    // End of main() method
}
// End of TriangleOfStarAndZeros class
