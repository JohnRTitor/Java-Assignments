import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of StringCheckPalindrome class
class StringCheckPalindrome {
    // Start of isPalindrome() method
    // Returns either "Palindrome" or "Not Palindrome"
    static String isPalindrome (String input_string) {
        // we convert the input string to lowercase
        // to make the comparison case-insensitive
        input_string = input_string.toLowerCase();
        String result = "";

        // then we reverse the input string
        // by iterating from the end of the string
        // and storing each character in the result string
        for (int i = input_string.length() - 1; i >= 0; i--) {
            result += input_string.charAt(i);
        }

        // finally we compare the input string with the reversed string
        if (input_string.equals(result)) {
            return "Palindrome";
        } else {
            return "Not Palindrome";
        }
    }
    // End of isPalindrome() method

    // Start of main() method
    public static void main (String[] args) {
        // create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string below: ");
        String input_string = sc.nextLine();

        // call the isPalindrome() method with the input string
        String result = isPalindrome(input_string);

        // finally we print the input string and the result
        System.out.println("Input string: " + input_string);
        System.out.println("Result: " + result);
    }
    // End of main() method
}
// End of StringCheckPalindrome class
