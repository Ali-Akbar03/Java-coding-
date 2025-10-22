import java.util.Scanner;

public class TEMPERATURECONVERTING {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double Fahrenheit, Celcius;

        System.out.print("Input a degree in Fahrenheit:");
        Fahrenheit = input.nextDouble();

        Celcius = (0.5/.9) * (Fahrenheit - 32);

        System.out.print(Fahrenheit+"degree Fahrenheit is equal to "+ Celcius+ " in Celcius" );




    }
    
}
