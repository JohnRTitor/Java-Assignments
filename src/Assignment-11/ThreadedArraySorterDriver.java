
import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of the ArraySorter class
class ArraySorter {
    // Method to sort the array in ascending order
    // this method can sort in ascending or descending order
    // based on the boolean value passed
    void sortArray (int[] arr, boolean isDescending) {
        // Synchronised block to avoid conflicts between threads
        // which means it avoids a critical section problem
        synchronized (this) {
            // bubble sort algorithm essentially compares adjacent elements
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    // here we decide whether to sort in ascending or descending order
                    // based on the boolean value passed
                    if (isDescending ? (arr[j] < arr[j + 1]) : (arr[j] > arr[j + 1])) {
                        // swap the elements
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            // print the sorted array
            System.out.println("Sorted array: ");
            for (int i: arr) {
                System.out.print(i + ", ");
            }
            System.out.println(isDescending ? "(Descending)" : "(Ascending)");
        }
        // End of the synchronised block
    }
    // End of the sortArray() method
}

// Start of the MyRunnable class
class MyRunnable implements Runnable {
    ArraySorter a;
    int[] arr;
    boolean isDescending;
    
    // Constructor to initialise the ArraySorter object, the array and the boolean value
    MyRunnable (ArraySorter a, int[] arr, boolean isDescending) {
        this.a = a;
        this.arr = arr;
        this.isDescending = isDescending;
    }

    // Overriding the run method of the Runnable interface
    // to call the synchronised sortArray method
    @Override
    public void run () {
        a.sortArray(arr, isDescending);
    }
}
// End of the MyRunnable class

// Start of the ThreadedArraySorterDriver class
class ThreadedArraySorterDriver
{
    // Start of the main() method
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArraySorter obj = new ArraySorter();

        // Take input from the user for two numbers
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

        // Create two threads for two numbers
        // thread1 for ascending order
        Thread thread1 = new Thread(new MyRunnable(obj, arr, false));
        // thread2 for descending order
        Thread thread2 = new Thread(new MyRunnable(obj, arr, true));

        // Start both threads simultaneously
        thread1.start();
        thread2.start();
        
        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }

        System.out.println("Operation completed. We have sorted the array in ascending order and then in descending order.");
    }
    // End of the main() method
}
// End of the ThreadedArraySorterDriver class
