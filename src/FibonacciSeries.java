import java.util.ArrayList;
import java.util.List;

class FibonacciSeries {
    public static void main (String[] args) {
        Integer noOfTerms = 20; // predefined, we could take user input if we wish

        // Creating a List of Integers
        List<Integer> fibTerms = new ArrayList<>();

        // predefine the first two terms
        fibTerms.add(0);
        fibTerms.add(1);

        // n'th term is the sum of n-1'th term and n-2'th term
        for (Integer i = 2; i <= noOfTerms; i++) {
            fibTerms.add(fibTerms.get(i - 1) + fibTerms.get(i - 2));
        }

        System.out.println(fibTerms);
    }
}
