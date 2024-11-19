import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of BinaryNumberChecking class
class BinaryNumberChecking {
    public static void main (String[] args) {
        // Scanner object from the scanner class is used
        // to read from the standard input (terminal)
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        // reading a number from standard input
        int num = sc.nextInt();

        // we temporarily store the number in a variable
        // so we don't lose the original number
        int temp = num;

        // this process uses the modulo operator to extract
        // the last digit of the number
        // and then divides the number by 10 to remove the last digit
        // this process is repeated until the number becomes 0
        // meaning all the digits have been extracted
        while (temp > 0) {
            int digit = temp % 10;
            // if the digit is not 0 or 1, then it is not a
            // binary number, so we print NO and terminate the program
            if (digit != 0 && digit != 1) {
                System.out.println("NO");
                return;
            }
            temp /= 10;
        }
        // if we reach this point, all the digits are either 0 or 1
        // so we print YES
        System.out.println("YES");
    }
}
// End of BinaryNumberChecking class
