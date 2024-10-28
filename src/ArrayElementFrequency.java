import java.util.Scanner;

class ArrayElementFrequency {
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

        System.out.println("Enter the element to find its frequency: ");
        int searchFor = sc.nextInt();

        int frequency = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == searchFor) {
                frequency++;
            }
        }

        if (frequency == 0) {
            System.out.println(searchFor + " not found in the array");
        } else {
            System.out.println("Frequency of " + searchFor + " is " + frequency);
        }
    }
}
