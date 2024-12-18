import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of MatrixAdditionSubtractionMultiplication class
class MatrixAdditionSubtractionMultiplication {
    // Start of main() method
    public static void main(String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        // Get matrix dimensions from user
        System.out.print("Enter number of rows for matrices: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns for matrices: ");
        int columns = sc.nextInt();

        // Initialize two matrices
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        // Get matrix elements from user
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Fill each rows from user input
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Fill each rows from user input
                matrix2[i][j] = sc.nextInt();
            }
        }

        while (true) {
            System.out.println("1. Add matrices");
            System.out.println("2. Subtract matrices");
            System.out.println("3. Multiply matrices");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            // Get user choice
            int choice = sc.nextInt();

            // start of switch case
            switch (choice) {
                case 1:
                    // Initialize sum matrix
                    int[][] sum = new int[rows][columns];
                    // Loop through each element and add
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            sum[i][j] = matrix1[i][j] + matrix2[i][j];
                        }
                    }
                    // Print sum matrix
                    System.out.println("Sum of matrices:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            System.out.print(sum[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    // Initialize subtraction matrix
                    int[][] sub = new int[rows][columns];
                    // Loop through each element and subtract
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            sub[i][j] = matrix1[i][j] - matrix2[i][j];
                        }
                    }

                    // Print subtraction matrix
                    System.out.println("Difference of matrices:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            System.out.print(sub[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    if (rows != columns) { // Check if multiplication is possible
                        System.out.println("Matrix multiplication not possible!");
                        return;
                    }

                    // Initialize product matrix
                    int[][] product = new int[rows][columns];
                    for (int i = 0; i < rows; i++) { // Loop through rows
                        for (int j = 0; j < columns; j++) { // Loop through columns
                            product[i][j] = 0; // Initialize result element to 0
                            for (int k = 0; k < columns; k++) { // Loop for multiplication
                                product[i][j] += matrix1[i][k] * matrix2[k][j]; // Multiply and add
                            }
                        }
                    }

                    // Print product matrix
                    System.out.println("Product of matrices:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            System.out.print(product[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    // To handle invalid choice
                    System.out.println("Invalid choice. Try again.");
            }
            // end of switch case
        }
    }
    // End of main() method
}
// End of MatrixAdditionSubtractionMultiplication class
