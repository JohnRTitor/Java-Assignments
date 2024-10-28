import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of StringDeleteConsonants class
class StringDeleteConsonants {
    // Start of removeConsonants() method
    // Returns the input string with consonants removed
    static String removeConsonants (String input_string) {
        // we initialize the result string to an empty string
        String result = "";

        // we iterate through the input string
        // on a per character basis
        for (int i = 0; i < input_string.length(); i++) {
            char ch = input_string.charAt(i);

            // we only allow vowels to be added to the result string
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                result += ch;
            }
        }
        // we return the result string with the consonants removed
        return result;
    }

    // Start of main() method
    public static void main (String[] args) {
        // create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string below: ");
        String input_string = sc.nextLine();

        // call the removeConsonants() method with the input string
        String result = removeConsonants(input_string);

        // finally we print the input string and the result
        System.out.println("Input string: " + input_string);
        System.out.println("Output string: " + result);
    }
    // End of main() method
}
// End of StringDeleteConsonants class
