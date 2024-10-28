import java.util.Scanner;

class StringDeleteConsonants {
    static String removeConsonants (String input_string) {
        String result = "";
        for (int i = 0; i < input_string.length(); i++) {
            char ch = input_string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                result += ch;
            }
        }
        return result;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_string = sc.nextLine();

        String result = removeConsonants(input_string);

        System.out.println("Input string: " + input_string);
        System.out.println("Output string: " + result);
    }
}