import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the base and exponent
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        
        // Call the method to calculate the power
        int result = calculatePower(base, exponent);
        
        // Output the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        
        // Close the scanner
        scanner.close();
    }

    // Method to calculate power
    public static int calculatePower(int base, int exponent) {
        int result = 1;
        
        // Loop to multiply the base exponent times
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        
        return result;
    }
}
