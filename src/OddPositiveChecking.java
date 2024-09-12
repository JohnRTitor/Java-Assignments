import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of OddPositiveChecking class
class OddPositiveChecking {
    public static void main(String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        // reading a number from standard input
        int num = sc.nextInt();

        // odd positive means both odd and positive (non-zero) number
        if (num > 0 && num % 2 != 0) {
            System.out.println("ODD POSITIVE");
        } else {
            System.out.println("NO");
        }
    }
}
// End of OddPositiveChecking class
