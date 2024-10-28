import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

class ArraySelectionSort {
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

        // selection sort essentially finds the minimum element in the unsorted part of the array
        // and swaps it with the first element of the unsorted part
        // repeat this process size - 1 times, to sort the whole array
        for (int i = 0; i < size - 1; i++) {
            // find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            // swap the minimum in the unsorted part with the first element of the unsorted part
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // print the sorted array
        System.out.println("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }
        // print a new line at the end since print() doesn't
        System.out.println();
    }
}
