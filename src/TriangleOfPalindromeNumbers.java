import java.util.Scanner;

class TriangleOfPalindromeNumbers {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rows to print? ");
        Integer rows = sc.nextInt();

        if (rows < 1) {
            // throw an error into the standard error stream, if user enters invalid input
            System.err.println("Error: No of rows must be positive.");
            System.exit(1);
        }

        for (Integer i = 1; i <= rows; i++) {
            // Print the increasing part of the pattern
            for (Integer j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print the decreasing part of the pattern
            for (Integer j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            // Move to the next row
            System.out.println();
        }
    }
}
