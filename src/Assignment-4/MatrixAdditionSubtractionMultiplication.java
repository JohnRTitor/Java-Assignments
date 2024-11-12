import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

class MatrixAdditionSubtractionMultiplication {
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
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        while (!exit) {
            System.out.println("1. Add matrices");
            System.out.println("2. Subtract matrices");
            System.out.println("3. Multiply matrices");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int[][] sum = new int[rows][columns];
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            sum[i][j] = matrix1[i][j] + matrix2[i][j];
                        }
                    }
                    System.out.println("Sum of matrices:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            System.out.println(sum[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int[][] sub = new int[rows][columns];
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            sub[i][j] = matrix1[i][j] - matrix2[i][j];
                        }
                    }
                    System.out.println("Difference of matrices:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            System.out.println(sub[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    multiplyMatrices(matrix1, matrix2, rows, columns);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
