import java.util.Scanner;

public class LEAPYEAR {
    public static void main(String[] args){
    int year;
    Scanner input = new Scanner(System.in);

    System.err.println("Enter any year - ");
    year = input.nextInt();

    if (year%400==0 || (year%4==0 && year%100 !=0 ))
    {
        System.err.println(year+ " ia a leap year - ");
    }

    else{
        System.err.println(year+" not a leap year");
    }

    }  
}
