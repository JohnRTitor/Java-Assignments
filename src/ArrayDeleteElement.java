import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of ArrayDeleteElement class
class ArrayDeleteElement {
    // Start of main() method
    public static void main (String[] args) {
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

        // reading the elements of the array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // reading the element to be deleted
        System.out.println("Enter the element to be deleted: ");
        int deleteThis = sc.nextInt();
        // variable to keep track how many times the element is found
        int found = 0;

        // print the original array
        System.out.println("Original array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }
        // print a new line at the end since print() doesn't
        System.out.println();

        // traverse the whole array
        for (int i = 0; i < size; i++) {
            // if the element is found
            if (arr[i] == deleteThis) {
                // increment the counter
                found++;
                // shift the elements to the left
                // which effectively deletes the element
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }

        if (found == 0) {
            // we reach here if the element is not found
            System.out.println(deleteThis + "not found in the array");
        } else {
            // we reach here if the element is found
            System.out.println(deleteThis + " found " + found + " times in the array and deleted");
            // decrement the size of the array by the number of times the element is found
            size -= found;
            // print the array after deletion
            System.out.println("Array after deletion: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + ", ");
            }
            // print a new line at the end since print() doesn't
            System.out.println();
        }
    }
    // End of main() method
}
// End of ArrayDeleteElement class
