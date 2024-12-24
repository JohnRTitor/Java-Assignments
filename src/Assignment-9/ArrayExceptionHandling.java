import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of ArrayExceptionHandling class
class ArrayExceptionHandling {
    // Start of main() method
    public static void main(String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        // reading the required size of the array and allocating memory
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        // reading the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the index to access the element: ");
        int index = sc.nextInt();
        try {
            // trying to access the element at the given index
            System.out.println("The element at index " + index + " is " + array[index]);

            // if no exception is thrown, then proceed to division
            System.out.println("Let's perform division. Which number do you want to divide by?");
            int divisor = sc.nextInt();
            // trying to divide the element at the given index
            System.out.println("The result of the division is " + (double) array[index] / divisor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        } finally {
            // exception occurred or not, this block will always be executed
            // so place cleanup code here
            System.out.println("End of program.");
            sc.close();
        }
    }
    // end of main() method
}
// end of ArrayExceptionHandling class
