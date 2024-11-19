import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of ArraySortHalfAscHalfDesc class
class ArraySortHalfAscHalfDesc {
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

        // print the original array
        System.out.println("Original array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }
        // print a new line at the end since print() doesn't
        System.out.println();

        // Sort the first half in ascending order
        int mid = size / 2; // Midpoint of the array
        for (int i = 0; i < mid; i++) {
            for (int j = 0; j < mid - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Sort the second half in descending order
        for (int i = mid; i < size; i++) {
            for (int j = mid; j < size - 1 - (i - mid); j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // print the sorted array
        System.out.println("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }
        // print a new line at the end since print() doesn't
        System.out.println();
    }
    // End of main() method
}
// End of ArraySortHalfAscHalfDesc class
