public class SERIES2 {

    public static int evaluateSeries(int n) {
        int sum = 0;

        // Iterate over the terms
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;  // Add odd numbers (1, 3, 5, ...)
            } else {
                sum -= i;  // Subtract even numbers (2, 4, 6, ...)
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // Example: Evaluate the series for n terms
        int n = 5;  // Change this value to calculate for different n
        int result = evaluateSeries(n);
        System.out.println("The sum of the series up to " + n + " terms is: " + result);
    }
}
