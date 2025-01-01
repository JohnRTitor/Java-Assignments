import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it
import java.io.*;
// We need to import the BufferedReader and FileReader classes

// Start of the FileReadWriteDemo class
class FileReadWriteDemo {
    // Start of the main() method
    public static void main(String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        // Get the file path from the user
        System.out.print("Enter the file path: ");
        String filePath = sc.nextLine();

        // Get content to write from the user
        System.out.println("Enter content to write to the file (type 'exit' to stop):");
        StringBuilder content = new StringBuilder();
        String line;
        while (true) {
            // Read each line from the user
            line = sc.nextLine();
            // should terminate if the user types 'exit'
            if (line.equalsIgnoreCase("exit")) {
                break;
            }
            // append each line along with a newline character to the content
            content.append(line).append("\n");
        }

        // Write content to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // dump all the content to the file
            writer.write(content.toString());
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            // catch exceptions occured during write operation
            System.out.println("Error writing to the file: " + e.getMessage());
        }

        // Read and display the content from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // read the content from the file
            System.out.println("\nReading content from the file:");
            String fileLine;
            while ((fileLine = reader.readLine()) != null) {
                // display each line read from the file
                System.out.println(fileLine);
            }
        } catch (IOException e) {
            System.out.println("Error reading from the file: " + e.getMessage());
        } finally {
            // close the scanner
            sc.close();
        }
    }
    // End of the main() method
}
// End of the FileReadWriteDemo class
