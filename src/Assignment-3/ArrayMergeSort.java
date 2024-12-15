import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of ArrayMergeSort class
class ArrayMergeSort {
    static void mergeSort (int[] arr, int lower, int upper) {
        if (lower < upper) {
            int mid = (lower + upper) / 2;
            // divide into subproblems
            mergeSort(arr, lower, mid);
            mergeSort(arr, mid + 1, upper);
            // conquer and combine
            merge(arr, lower, mid, upper);
        }
    }

    static void merge (int[] arr, int lower, int mid, int upper) {
        int n1 = mid - lower + 1;
        int n2 = upper - mid;

        // create temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            left[i] = arr[lower + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = lower;
        // merge the temporary arrays, in sorted order
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // copy the remaining elements of left[] and right[], if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

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

        mergeSort(arr, 0, size - 1);

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
// End of ArrayMergeSort class
