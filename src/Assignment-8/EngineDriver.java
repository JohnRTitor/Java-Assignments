import java.util.Scanner;
// to use the Scanner class and its methods for input
// we need to import it

// Start of the Engine interface
interface Engine {
    // abstract methods of the Engine interface
    // should be implemented by the classes that implement this interface
    void speedUp (int value);
    void changeGear (int value);
}
// end of Engine interface

// Start of the HondaEngine class implementing the Engine interface
class HondaEngine implements Engine {
    // instance variables of the HondaEngine class
    int speed;
    int gear;

    // constructor to initialize the instance variables
    HondaEngine () {
        // initially speed should be 0 and gear should be neutral
        this.speed = 0;
        this.gear = 0;
    }
    // end of constructor

    // implementation of the speedUp() method from the Engine interface
    public void speedUp (int value) {
        // maximum speed limit is 120
        if (this.speed > 120 || this.speed + value > 120) {
            System.out.println("Speed limit reached.");
            return;
        }
        // we are starting the engine so shift to first gear
        if (this.speed == 0) {
            this.gear = 1;
            System.out.println("Shifting to first gear.");
        }
        // increase the speed by the given value
        // negative value should be allowed to decrease the speed
        this.speed += value;
        System.out.println("Current speed: " + this.speed);
    }
    // end of speedUp() method

    // implementation of the changeGear() method from the Engine interface
    public void changeGear (int value) {
        // if asked to change to neutral gear, we stop the bike
        if (value == 0) {
            this.gear = 0;
            this.speed = 0;
            System.out.println("Gear changed to neutral. Speed is now 0.");
        }
        // we shift gear
        else if (value > 0) {
            this.gear = value;
            System.out.println("Gear changed to " + this.gear);
        }
        // handle invalid gear value
        else {
            System.out.println("Invalid gear value.");
        }
    }
    // end of changeGear() method
}
// end of HondaEngine class

// Start of the EngineDriver class
class EngineDriver {
    // Start of main() method
    public static void main(String[] args) {
        // Scanner object from the Scanner class is used
        Scanner sc = new Scanner(System.in);

        // Initialise the HondaEngine object
        HondaEngine myBike = new HondaEngine();

        // Start the bike
        System.out.println("Let's start the bike.");
        System.out.print("What should be the initial speed? ");
        int initialSpeed = sc.nextInt();
        myBike.speedUp(initialSpeed);

        // let's drive the bike around by increasing speed and changing gears
        // implemented by the menu
        while (true) {
            System.out.println("Enter 1 to speed up, 2 to change gear, 0 to stop the bike.");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the speed to increase by: ");
                    int speedUpValue = sc.nextInt();
                    myBike.speedUp(speedUpValue);
                    break;
                case 2:
                    System.out.print("Enter the gear value: ");
                    int gearValue = sc.nextInt();
                    myBike.changeGear(gearValue);
                    break;
                case 0:
                    System.out.println("Stopping the bike.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        // end of menu
    }
    // end of main() method
}
// end of EngineDriver class
