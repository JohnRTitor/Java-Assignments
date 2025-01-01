import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it
import java.io.*;
// We need to import the BufferedReader and FileReader classes

// Start of the FileReadDisplay class
class FileReadDisplay {
    // Start of the main() method
    public static void main(String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        // Get the file path from the user
        System.out.print("Enter the file name: ");
        String filePath = sc.nextLine();

        // BufferedReader object to read the file
        BufferedReader reader = null;

        try {
            // Open the file using BufferedReader
            reader = new BufferedReader(new FileReader(filePath));
            String line;

            // Display the content of the file
            System.out.println("File content: ");
            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading the file");
        } finally {
            // Close the scanner
            sc.close();
            // Close the file reader
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file");
            }
        }
        // End of try-catch-finally block
    }
    // End of the main() method
}
// End of the FileReadDisplay class
