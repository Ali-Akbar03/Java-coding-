import java.util.Scanner;

public class SEASONTOMONTH {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a month number (1 to 12)
        System.out.print("Enter the month number (1 to 12): ");
        int month = scanner.nextInt();

        // Variable to store the season name
        String season = "";

        // Using switch statement to find the Bangla season
        switch (month) {
            case 1: case 2:
                season = "Poush / Magh";
                break;
            case 3: case 4:
                season = "Falgun / Chaitra";
                break;
            case 5: case 6:
                season = "Baishakh / Jyoishtho";
                break;
            case 7: case 8:
                season = "Asharh / Shrabon";
                break;
            case 9: case 10:
                season = "Bhadro / Ashwin";
                break;
            case 11: case 12:
                season = "Kartik / Ogrohayon";
                break;
            default:
                season = "Invalid month. Please enter a number between 1 and 12.";
        }

        // Output the result
        System.out.println("The Bangla season for month " + month + " is: " + season);

        // Close the scanner
        scanner.close();
    }
}
