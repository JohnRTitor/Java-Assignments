import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of ArrayInsertElement class
class ArrayInsertElement {
    // Start of main() method
    public static void main (String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        // reading the required size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        // a simple handle cases where user entered invalid size
        if (size <= 0) {
            System.out.println("Invalid size");
            return;
        }

        // allocating memory for the array
        int[] arr = new int[size + 1];
        System.out.print("Enter the elements: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // reading the element to be inserted
        System.out.print("Enter the element to be inserted: ");
        int insertThis = sc.nextInt();

        // reading the position where the element is to be inserted
        System.out.print("Enter the position: ");
        int position = sc.nextInt();
        // a simple check to handle cases where user entered invalid position
        if (position < 1 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        // index is position - 1 since array index starts from 0
        int index = position - 1;

        // print the original array
        System.out.println("Original array: ");
        for (int i = 0; i < size; i++) {
            // print with a `,` and space after each element
            System.out.print(arr[i] + ", ");
        }
        // print a new line at the end since print() doesn't
        System.out.println();

        // shift the elements to the right starting from the end
        // to make space for the new element
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        // insert the element at the given position
        arr[index] = insertThis;
        // increment the size of the array
        size++;

        // print the array after insertion
        System.out.println("Array after insertion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }
        // print a new line at the end since print() doesn't
        System.out.println();
    }
    // End of main() method
}
// End of ArrayInsertElement class
