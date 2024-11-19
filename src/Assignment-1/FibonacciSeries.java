// Start of FibonacciSeries class
class FibonacciSeries {
    public static void main (String[] args) {
        int noOfTerms = 20; // predefined, we could take user input if we wish

        // first two terms of the Fibonacci series
        int num1 = 0, num2 = 1;

        // Fibonacci series is defined as n'th term is
        // the sum of (n-1)'th and (n-2)'th term
        for (int i = 1; i <= noOfTerms; i++) {
            System.out.println(num1);
            int nextnum = num1 + num2;
            // updating the values of num1 and num2
            // for the next iteration
            num1 = num2;
            num2 = nextnum;
        }
    }
}
// End of FibonacciSeries class
