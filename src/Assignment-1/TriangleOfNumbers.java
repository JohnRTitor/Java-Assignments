import java.util.Scanner;

// Start of TriangleOfNumbers class
class TriangleOfNumbers {
    public static void main (String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rows to print? ");
        // reading a number from standard input
        int rows = sc.nextInt();

        if (rows < 1) {
            // throw an error into the standard error stream, if user enters invalid input
            System.out.println("Error: No of rows must be positive.");
            return;
        }

        for (int i = 1; i <= rows; i++) {
            // Print the increasing part of the pattern
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print the decreasing part of the pattern
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            // Move to the next row by printing a newline
            System.out.println();
        }
    }
}
// End of TriangleOfNumbers class
