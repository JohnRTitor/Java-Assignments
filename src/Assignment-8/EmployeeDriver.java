import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of the Employee abstract class
abstract class Employee {
    // instance variables of the Employee class
    int empNo;
    String name;

    // constructor to initialize the instance variables
    Employee (int empNo, String name) {
        this.empNo = empNo;
        this.name = name;
    }

    // abstract methods to be implemented by the subclasses
    abstract double netSalary();
    abstract void display();
}
// end of Employee class

// Start of the Manager class inheriting from the Employee class
class Manager extends Employee {
    // extra instance variable of the Manager class
    double salary;

    // constructor to initialize the instance variables
    Manager (int empNo, String name, double salary) {
        super(empNo, name);
        this.salary = salary;
    }
    // end of constructor

    // implementation of the netSalary() method from the Employee class
    @Override
    double netSalary() {
        // - 7.5% of basic
        double pf = 0.075;
        // + 80% of basic
        double da = 0.8;
        // + 5% of basic
        double hra = 0.05;
        // + 3% of basic
        double medical = 0.03;
        return (da + hra + medical - pf) * salary;
    }
    // end of netSalary() method

    // implementation of the display() method from the Employee class
    @Override
    void display () {
        System.out.println("Manager - Employee Number: " + this.empNo + ", Name: " + this.name + ", Basic Wage: " + this.salary);
    }
    // end of display() method
}
// end of Manager class

// Start of the Clerk class inheriting from the Employee class
class Clerk extends Employee {
    // extra instance variable of the Clerk class
    double salary;

    // constructor to initialize the instance variables
    Clerk (int empNo, String name, double salary) {
        super(empNo, name);
        this.salary = salary;
    }
    // end of constructor

    // implementation of the netSalary() method from the Employee class
    @Override
    double netSalary() {
        // - 7.5% of basic
        double pf = 0.075;
        // + 50% of basic
        double da = 0.5;
        // + 5% of basic
        double hra = 0.05;
        // + 3% of basic
        double medical = 0.03;
        return (da + hra + medical - pf) * salary;
    }
    // end of netSalary() method

    // implementation of the display() method from the Employee class
    @Override
    void display () {
        System.out.println("Clerk - Employee Number: " + this.empNo + ", Name: " + this.name + ", Basic Wage: " + this.salary);
    }
    // end of display() method
}
    // end of Clerk class

// Start of the EmployeeDriver class
class EmployeeDriver {
    // Start of main() method
    public static void main(String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        // Input for Manager
        System.out.println("Manager Details:");
        System.out.print("\t Employee Number: ");
        int empNo = sc.nextInt();
        System.out.print("\t Name: ");
        // consume the newline character
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("\t Basic Wage: ");
        double salary = sc.nextDouble();

        // create a Manager object by calling the constructor
        Manager m1 = new Manager(empNo, name, salary);

        // Input for Clerk
        System.out.println("Clerk Details:");
        System.out.print("\t Employee Number: ");
        empNo = sc.nextInt();
        System.out.print("\t Name: ");
        // consume the newline character
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("\t Basic Wage: ");
        salary = sc.nextDouble();

        // create a Clerk object by calling the constructor
        Clerk c1 = new Clerk(empNo, name, salary);

        // print the details of the Manager and Clerk along with their net salary
        m1.display();
        System.out.println("Net Salary: " + m1.netSalary());
        c1.display();
        System.out.println("Net Salary: " + c1.netSalary());
    }
    // end of main() method
}
// end of EmployeeDriver class
