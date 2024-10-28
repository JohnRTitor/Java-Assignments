import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of StringCountWords class
class StringCountWords {
    // Start of countWords() method
    // Returns the count of words in the input string
    static int countWords (String input_string) {
        // we initialize the count to 1
        int count = 1;

        // then we iterate through the input string
        // per character basis
        for (int i = 0; i < input_string.length(); i++) {
            char ch = input_string.charAt(i);
            // if we encounter a space character
            // then a new word begins
            // so we increment the count
            if (ch == ' ') {
                count++;
            }
        }
        // return the count of words
        return count;
    }

    // Start of main() method
    public static void main (String[] args) {
        // create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string below: ");
        String input_string = sc.nextLine();

        // call the countWords() method with the input string
        int result = countWords(input_string);

        // finally we print the input string and the count of words
        System.out.println("Input string: " + input_string);
        System.out.println("Count of words: " + result);
    }
    // End of main() method
}
// End of StringCountWords class
