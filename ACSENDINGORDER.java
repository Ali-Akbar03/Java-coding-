import java.util.Scanner;

public class ACSENDINGORDER {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements they want to sort
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store the numbers
        int[] numbers = new int[n];

        // Ask the user to input the numbers
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sorting the array in ascending order using Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap the numbers if they are in the wrong order
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Output the sorted array
        System.out.println("Sorted numbers in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
