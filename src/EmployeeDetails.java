import java.util.Scanner;

class EmployeeDetails {
    String name;
    String email;
    String empCode;
    Integer phone;

    // Constructor to initialize the object
    EmployeeDetails () {
        // Automatically reads the data from standard input
        // when creating an instance of the class
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        this.name = sc.nextLine();

        System.out.print("Email: ");
        this.email = sc.nextLine();

        System.out.print("Employee Code: ");
        this.empCode = sc.nextLine();

        System.out.print("Phone: ");
        this.phone = sc.nextInt();
    }

    static void formattedPrinting (String arg1, String arg2, String arg3, String arg4) {
        // print in tabular format
        System.out.println(arg1 + "\t" + arg2 + "\t" + arg3 + "\t" + arg4);
    }

    public static void main (String[] args) {
        System.out.println("Employee 1: ");
        EmployeeDetails e1 = new EmployeeDetails();

        System.out.println("Employee 2: ");
        EmployeeDetails e2 = new EmployeeDetails();

        // print the details in tabular format
        formattedPrinting("Name", "email-id", "EMP-CODE", "PHONE");
        formattedPrinting(e1.name, e1.email, e1.empCode, e1.phone.toString());
        formattedPrinting(e2.name, e2.email, e2.empCode, e2.phone.toString());
    }
}
