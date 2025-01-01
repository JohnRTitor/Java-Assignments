import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of the Table class
class Table
{
    // Method to print the multiplication table of a given number
    void printTable (int number) {
        // Synchronised block to avoid conflicts between threads
        // which means it avoids a critical section problem
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }       
    }
    // End of the printTable() method
}
// End of the Table class

// Start of the MyRunnable class
class MyRunnable implements Runnable {
    Table t;
    int n;
    
    // Constructor to initialise the Table object and the number
    MyRunnable (Table t, int n) {
        this.t = t;
        this.n = n;
    }

    // Overriding the run method of the Runnable interface
    // to call the synchronised printTable method
    @Override
    public void run () {
        t.printTable(n);
    }
}
// End of the MyRunnable class

// Start of the ThreadedMultiplicationTableDriver class
class ThreadedMultiplicationTableDriver
{
    // Start of the main method
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Table obj = new Table();

        // Take input from the user for two numbers
        System.out.println("Enter two numbers for which you want to see the multiplication table: ");
        int number1 = sc.nextInt(); // First number for the table
        int number2 = sc.nextInt(); // Second number for the table

        // Create two threads for two numbers
        Thread thread1 = new Thread(new MyRunnable(obj, number1));
        Thread thread2 = new Thread(new MyRunnable(obj, number2));

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

        System.out.println("Multiplication tables displayed for numbers " + number1 + " and " + number2);
    }
    // End of the main() method
}
// End of the ThreadedMultiplicationTableDriver class
