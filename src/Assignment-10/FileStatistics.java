import java.io.*;
// to use the Scanner class and its methods for input
// we need to import it
import java.util.Scanner;
// We need to import the BufferedReader and FileReader classes

// Start of the FileStatistics class
class FileStatistics {
    // Start of the main() method
    public static void main(String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        // Get the file path from the user
        System.out.print("Enter the file path: ");
        String filePath = sc.nextLine();

        // Create a reference to the BufferedReader object
        BufferedReader reader = null;

        try {
            // Open the file in read mode
            reader = new BufferedReader(new FileReader(filePath));

            // Initialize counters for line, word, and character counts
            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;

            String line;
            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                lineCount++; // Increment line count
                charCount += line.length(); // Count characters in each line

                // Split the line by space into words
                String[] words = line.split("\\s+");
                // Increment word count by the number of words in the line
                wordCount += words.length;
            }

            // Display the counts
            System.out.println("File Statistics:");
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file path and try again.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading the file.");
        } finally {
            // Close the scanner
            sc.close();
            try {
                // Close the file reader
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error: Failed to close the file reader.");
            }
        }
        // End of try-catch-finally block
    }
    // End of the main() method
}
// End of the FileStatistics class
