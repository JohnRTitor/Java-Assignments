import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of StringFindMatch class
class StringFindMatch {
    public static void main (String[] args) {
        // create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Get the input strings and regions to match from the user
        System.out.println("Enter string1: ");
        String str1 = sc.nextLine();
        System.out.println("Region to match for string1: ");
        System.out.println("Lower bound and upper bound: ");
        int low1 = sc.nextInt();
        int high1 = sc.nextInt();

        // we need to check if the bounds are valid
        if (low1 < 0 || high1 >= str1.length() || low1 > high1) {
            System.out.println("Invalid bounds.");
            return;
        }

        sc.nextLine(); // to consume the newline character

        // get the input strings and regions to match from the user
        System.out.println("Enter string2: ");
        String str2 = sc.nextLine();
        System.out.println("Region to match for string2: ");
        System.out.println("Lower bound and upper bound: ");
        int low2 = sc.nextInt();
        int high2 = sc.nextInt();

        // we need to check if the bounds are valid
        if (low2 < 0 || high2 >= str2.length() || low2 > high2) {
            System.out.println("Invalid bounds.");
            return;
        }

        // length of the substrings should be the same
        // else we automatically invalidate the match
        if (high1 - low1 != high2 - low2) {
            System.out.println("Lengths of the regions to match are different.");
            return;
        }

        // finally we compare the substrings
        if (str1.substring(low1, high1).equals(str2.substring(low2, high2))) {
            System.out.println("Match found.");
        } else {
            System.out.println("No match found.");
        }

        // finally we print the input strings
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
    }
    // End of main() method
}
// End of StringFindMatch class
