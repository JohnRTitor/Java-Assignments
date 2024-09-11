import java.util.Scanner;

class BinaryNumberChecking {
    static boolean isBinary(Integer num) {
        // Here we are converting the number to a string
        String numStr = num.toString();
        // Splitting the string into an array of strings, namely digits
        String[] digits = numStr.split("");

        for (String digit : digits) {
            // If the digit is not 0 or 1, then it is not a binary number
            if (!digit.equals("0") && !digit.equals("1")) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        // reading a number from standard input
        Integer num = sc.nextInt();

        if (isBinary(num)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
