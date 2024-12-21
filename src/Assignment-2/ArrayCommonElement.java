import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of ArrayCommonElement class
class ArrayCommonElement {
    // Start of main() method
    public static void main(String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        // reading the required size of the array
        System.out.print("Enter the size of the first array: ");
        int size1 = sc.nextInt();
        if (size1 <= 0) {
            System.out.println("Invalid size");
            return;
        }

        // allocating memory for the array
        int[] arr1 = new int[size1];
        System.out.print("Enter the elements of the first array: ");

        // reading the elements of the array
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        // reading the required size of the array
        System.out.print("Enter the size of the second array: ");
        int size2 = sc.nextInt();
        if (size2 <= 0) {
            System.out.println("Invalid size");
            return;
        }

        // allocating memory for the array
        int[] arr2 = new int[size2];
        System.out.print("Enter the elements of the second array: ");

        // reading the elements of the array
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Minimum of the two sizes should be enough to find the common elements
        int[] arrCommon = new int[size2];
        int sizeCommon = 0;

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    // Add the common element to the new array
                    arrCommon[sizeCommon++] = arr1[i];
                    break;
                }
            }
        }

        // print the common elements
        System.out.println("Common elements: ");
        for (int i = 0; i < sizeCommon; i++) {
            System.out.print(arrCommon[i] + ", ");
        }
        System.out.println();

        System.out.println("Elements of array 1 without the common elements: ");
        // take each element of the first array
        for (int i = 0; i < size1; i++) {
            int isCommon = 0;
            // check if it is common with the common elements
            for (int j = 0; j < sizeCommon; j++) {
                if (arr1[i] == arrCommon[j]) {
                    isCommon = 1;
                    break;
                }
            }
            // print the non common elements of the first array
            if (isCommon == 0) {
                System.out.print(arr1[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Elements of array 2 without the common elements: ");
        // take each element of the second array
        for (int i = 0; i < size2; i++) {
            int isCommon = 0;
            // check if it is common with the common elements
            for (int j = 0; j < sizeCommon; j++) {
                if (arr2[i] == arrCommon[j]) {
                    isCommon = 1;
                    break;
                }
            }
            // print the non common elements of the second array
            if (isCommon == 0) {
                System.out.print(arr2[i] + ", ");
            }
        }
        System.out.println();
    }
    // End of main() method
}
// End of ArrayCommonElement class
