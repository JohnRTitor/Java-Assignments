import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of ArraySumOfPairs class
class ArraySumOfPairs {
    // Start of main() method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // reading the required size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        if (size <= 0) {
            // handle cases where user entered invalid size
            System.out.println("Invalid size");
            return;
        }

        // allocating memory for the array
        int[] arr = new int[size];
        System.out.print("Enter the elements: ");

        // reading the elements of the array one by one
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // reading the sum to be checked
        System.out.print("Enter the sum: ");
        int sum = sc.nextInt();

        // print the entered array
        System.out.println("Entered array: ");
        for (int num : arr) {
            System.out.print(num + ", ");
        }
        // print a new line at the end since print() doesn't
        System.out.println();

        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                // check if the sum of the elements at index i and j is equal to the given sum
                if (i != j && arr[i] + arr[j] == sum) {
                    System.out.println("Pair found at index " + i + " and " + j + " (" + arr[i] + " + " + arr[j] + ")");
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("No pairs found adding up to the given sum");
        }
    }
    // End of main() method
}
// End of ArraySumOfPairs class
