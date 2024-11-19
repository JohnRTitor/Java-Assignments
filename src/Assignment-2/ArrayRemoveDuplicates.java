import java.util.Scanner;

class ArrayRemoveDuplicates {
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
            // print with a `,` and space after each element
            System.out.print(arr[i] + ", ");
        }
        // print a new line at the end since print() doesn't
        System.out.println();


        // traverse the whole array
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                // if the element is found
                if (arr[i] == arr[j]) {
                    // shift the elements to the left
                    // which effectively deletes the element
                    for (int k = j; k < size - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    size--;
                }
            }
        }

        // print the array after removing duplicates
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }
        // print a new line at the end since print() doesn't
        System.out.println();

        System.out.println("Size of the array after removing duplicates: " + size);
    }
}
