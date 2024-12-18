import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of MatrixRowMinColMax class
class MatrixRowMinColMax {
    // Start of main() method
    public static void main(String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Fill each rows from user input
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print original matrix with row minimums
        for (int i = 0; i < rows; i++) {
            // Print each row
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            // Find row minimum
            int rowMin = matrix[i][0];
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] < rowMin)
                    rowMin = matrix[i][j];
            }
            // Print row minimum
            System.out.println(rowMin);
        }
        System.out.println();

        for (int j = 0; j < columns; j++) {
            // Find column maximum
            int colMax = matrix[0][j];
            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] > colMax)
                    colMax = matrix[i][j];
            }
            // Print column maximum
            System.out.print(colMax + "\t");
        }
        System.out.println();
    }
    // End of main() method
}
// End of MatrixRowMinColMax class
