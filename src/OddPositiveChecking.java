import java.util.Scanner;

class OddPositiveChecking {
    static boolean isOdd(Integer num) {
        return (num % 2) != 0;
    }
    static boolean isPositive(Integer num) {
        return num > 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        Integer num = sc.nextInt();

        // odd positive means both odd and positive (non-zero) number
        if (isOdd(num) && isPositive(num)) {
            System.out.println("ODD POSITIVE");
        } else {
            System.out.println("NO");
        }
    }
}
