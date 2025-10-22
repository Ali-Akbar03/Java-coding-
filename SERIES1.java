public class SERIES1 {

    public static int sumOfSquares(int n) {
        int sum = 0;

        // Iterate over the first n odd numbers
        for (int i = 1; i <= n; i++) {
            int oddNumber = 2 * i - 1;  // Generate the i-th odd number
            sum += oddNumber * oddNumber;  // Add its square to the sum
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 5;  // Change this value to calculate for different n
        int result = sumOfSquares(n);
        System.out.println("The sum of squares of the first " + n + " odd numbers is: " + result);
    }
}
