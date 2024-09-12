// This Java program demonstrates the use of escape sequences to print a quoted line
// and special characters that require escaping

// Start of class PrintQuotedLine
class PrintQuotedLine {
    public static void main(String[] args) {
        // println() method prints the string and moves the cursor to the next line
        // printing a double quote character requires escaping it with a backslash
        // same goes for backslash itself
        System.out.println("\"Can we print '\\' with System.out.println() statement?\"");
    }
}
// End of class PrintQuotedLine