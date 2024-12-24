import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of the Person class
class Person {
    // instance variables of the Person class
    String name;
    String address;

    // constructor to initialize the instance variables
    Person (String name, String address) {
        this.name = name;
        this.address = address;
    }
    // end of constructor

    // setter method to set the instance variables
    void setPerson (String name, String address) {
        this.name = name;
        this.address = address;
    }
    // end of setPerson() method

    // method to return the printable string of the object
    String toPrintableString () {
        return "Name: " + this.name + " Address: " + this.address;
    }
    // end of toPrintableString() method
}
// end of Person class

// Start of Student class inheriting from Person class
class Student extends Person {
    // instance variables of the Student class
    String program;
    String year;
    double fees;

    // + inherited instance variables from the Person class

    // constructor to initialize the instance variables
    Student(String name, String address, String program, String year, double fees) {
        // call the constructor of the Person class
        super(name, address);
        // initialize the extra instance variables of the Student class
        this.program = program;
        this.year = year;
        this.fees = fees;
    }

    // setter method to set the instance variables
    void setStudent(String name, String address, String program, String year, double fees) {
        // call the setPerson() method of the Person class
        setPerson(name, address);
        // set the extra instance variables of the Student class
        this.program = program;
        this.year = year;
        this.fees = fees;
    }
    // end of setStudent() method

    // method to return the printable string of the object
    String toPrintableString() {
        return super.toPrintableString() + " Program: " + this.program + " Year: " + this.year + " Fees: " + this.fees;
    }
    // end of toPrintableString() method
}
// end of Student class

// Start of Staff class inheriting from Person class
class Staff extends Person {
    // instance variables of the Staff class
    String college;
    double pay;

    // + inherited instance variables from the Person class
    Staff(String name, String address, String college, double pay) {
        // call the constructor of the Person class
        super(name, address);
        this.college = college;
        this.pay = pay;
    }
    // end of Staff constructor

    // method to set the instance variables of the Staff class
    void setStaff(String name, String address, String college, double pay) {
        // call the setPerson method from the Person class
        setPerson(name, address);
        this.college = college;
        this.pay = pay;
    }
    // end of setStaff() method

    // method to return the printable string of the object
    String toPrintableString() {
        return super.toPrintableString() + " College: " + this.college + " Pay: " + this.pay;
    }
    // end of toPrintableString() method
}
// end of Staff class


// Start of SchoolDriver class
class SchoolDriver {
    // Start of main() method
    public static void main(String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        // Input for Student
        System.out.println("Enter student details:");
        System.out.print("Name: ");
        String studentName = sc.nextLine();
        System.out.print("Address: ");
        String studentAddress = sc.nextLine();
        System.out.print("Program: ");
        String studentProgram = sc.nextLine();
        System.out.print("Year: ");
        String studentYear = sc.nextLine();
        System.out.print("Fees: ");
        double studentFees = sc.nextDouble();
        sc.nextLine(); // consume the newline

        // create a Student object by calling the constructor
        Student student1 = new Student(studentName, studentAddress, studentProgram, studentYear, studentFees);

        // Input for Staff
        System.out.println("\nEnter staff details:");
        System.out.print("Name: ");
        String staffName = sc.nextLine();
        System.out.print("Address: ");
        String staffAddress = sc.nextLine();
        System.out.print("College: ");
        String staffCollege = sc.nextLine();
        System.out.print("Pay: ");
        double staffPay = sc.nextDouble();

        // create a Staff object by calling the constructor
        Staff staff1 = new Staff(staffName, staffAddress, staffCollege, staffPay);

        // Print the details entered
        System.out.println("\nDetails entered:");
        System.out.println("Student:- " + student1.toPrintableString());
        System.out.println("Staff:- " + staff1.toPrintableString());

        sc.nextLine(); // consume the newline
        // Ask the user if they want to update the details
        System.out.print("\nDo you want to update the details? (yes/no): ");
        String response = sc.nextLine();

        // Check if the user wants to update the details
        if (response.toLowerCase().equals("yes")) {
            // Update Student details
            System.out.println("\nUpdate student details:");
            System.out.print("Name: ");
            studentName = sc.nextLine();
            System.out.print("Address: ");
            studentAddress = sc.nextLine();
            System.out.print("Program: ");
            studentProgram = sc.nextLine();
            System.out.print("Year: ");
            studentYear = sc.nextLine();
            System.out.print("Fees: ");
            studentFees = sc.nextDouble();
            sc.nextLine(); // consume the newline

            // update the student details by calling the setter method
            student1.setStudent(studentName, studentAddress, studentProgram, studentYear, studentFees);
            System.out.println("Updated Student Details: " + student1.toPrintableString());

            // Update Staff details
            System.out.println("\nUpdate staff details:");
            System.out.print("Name: ");
            staffName = sc.nextLine();
            System.out.print("Address: ");
            staffAddress = sc.nextLine();
            System.out.print("College: ");
            staffCollege = sc.nextLine();
            System.out.print("Pay: ");
            staffPay = sc.nextDouble();

            // update the staff details by calling the setter method
            staff1.setStaff(staffName, staffAddress, staffCollege, staffPay);
            System.out.println("Updated Staff Details: " + staff1.toPrintableString());
        }
        // close the scanner to prevent resource leak
        sc.close();
    }
    // End of main() method
}
// End of SchoolDriver class
