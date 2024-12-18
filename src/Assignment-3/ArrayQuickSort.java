import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of ArrayQuickSort class
class ArrayQuickSort {
    // Start of quickSort() method
    static void quickSort (int[] arr, int lower, int upper) {
        if (lower < upper) {
            int pivotIndex = partition(arr, lower, upper);
            quickSort(arr, lower, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, upper);
        }
    }
    // End of quickSort() method

    // Partition method to place the pivot at its correct position
    static int partition(int[] arr, int low, int high) {
        // Selecting the first element as the pivot
        int pivot = arr[low];
        int i = low + 1; // Index for elements greater than pivot
        int j = high; // Index for elements less than pivot

        while (true) {
            // Move i to the right while arr[i] <= pivot
            while (i <= high && arr[i] <= pivot) {
                i++;
            }

            // Move j to the left while arr[j] > pivot
            while (j >= low && arr[j] > pivot) {
                j--;
            }

            // If i and j have crossed, break the loop
            if (i >= j) {
                break;
            }

            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Swap the pivot element with arr[j]
        int temp = arr[low]; // pivot gets its proper position
        arr[low] = arr[j];
        arr[j] = temp;

        return j; // Return the pivot index
    }
    // End of partition() method

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

        quickSort(arr, 0, size - 1);

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
// End of ArrayQuickSort class
