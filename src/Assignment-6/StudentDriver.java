import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of Student class
class Student {
    // instance variables of the Student class
    String name;
    int rollNo;

    // constructor to initialize the instance variables
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // method to compare two Student objects
    boolean isEqual(Student anotherStudent) {
        // for two objects to be equal, their name and rollNo should be equal
        return this.name.equals(anotherStudent.name) && (this.rollNo == anotherStudent.rollNo);
    }
    // end of isEqual() method
}

// Start of driver class
class StudentDriver {
    // Start of main() method
    public static void main(String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        // Get first student's details from user
        System.out.println("Enter details of Student 1:");
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Roll No: ");
        int rollNo1 = sc.nextInt();

        // Create a Student object with the given details
        Student s1 = new Student(name1, rollNo1);

        // Consume the newline character left by nextInt()
        // this sanitizes the input buffer so that nextLine() works as expected
        sc.nextLine();

        // Get second student's details from user
        System.out.println("Enter details of Student 2:");
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Roll No: ");
        int rollNo2 = sc.nextInt();

        // Create a Student object with the given details
        Student s2 = new Student(name2, rollNo2);

        // Finally, compare the two Student objects
        if (s1.isEqual(s2)) {
            System.out.println("Both students are the same.");
        } else {
            System.out.println("Students are different.");
        }
    }
    // End of main() method
}
// End of driver class
