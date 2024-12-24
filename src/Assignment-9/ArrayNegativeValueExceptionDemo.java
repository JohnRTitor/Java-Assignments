import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of the custom NegativeValueException
class NegativeValueException extends Exception {
    // just pass the message to the super class
    NegativeValueException(String message) {
        super(message);
    }
    // end of constructor
}
// end of NegativeValueException class

// Start of the ArrayNegativeValueExceptionDemo class
class ArrayNegativeValueExceptionDemo {
    // method to validate the array for negative values
    // throws the NegativeValueException if a negative value is found
    static void validateArray (int[] arr) throws NegativeValueException {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                throw new NegativeValueException("Negative value found at index " + i);
            }
        }
    }
    // end of validateArray() method

    // Start of main() method
    public static void main(String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        // reading the required size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Invalid size");
            return;
        }

        // allocating memory for the array
        int[] arr = new int[size];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        try {
            // trying to validate the array for negative values
            validateArray(arr);

            // if no exception is thrown, then the array is valid
            System.out.println("Congradulations, Array is valid.");
            // printing the array for clarity
            System.out.print("Array: ");
            for (int i : arr) {
                System.out.print(i + ", ");
            }
        } catch (NegativeValueException e) {
            // handle the exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // exception occurred or not, this block will always be executed
            // so place cleanup code here
            System.out.println("End of program.");
            sc.close();
        }
    }
    // end of main() method
}
// end of ArrayNegativeValueExceptionDemo class
