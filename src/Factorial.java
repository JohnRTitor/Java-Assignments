import java.util.Scanner;

public class Factorial {
    public static long calculateFactorial (int num) {
        long result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        long factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}