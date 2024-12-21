import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of ArrayLongestConsecutiveStreak class
class ArrayLongestConsecutiveStreak {
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

        // reading the elements of the array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array first using Bubble Sort
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Find the longest consecutive streak
        // initialize the maxStreak and currentStreak to 0 and 1 respectively
        int maxStreak = 0;
        int currentStreak = 1;
        for (int i = 0; i < size; i++) {
            // If the current element is consecutive to the next element
            if (i < size - 1 && arr[i] == arr[i + 1] - 1) {
                currentStreak++;
            } else {
                // If the current element is not consecutive to the next element
                if (currentStreak > maxStreak) {
                    // set the maxStreak to the currentStreak
                    maxStreak = currentStreak;
                }
                // reset the currentStreak
                currentStreak = 1;
            }
        }

        // print the longest consecutive streak
        System.out.println("Longest consecutive streak: " + maxStreak);
    }
    // End of main() method
}
// End of ArrayLongestConsecutiveStreak class
