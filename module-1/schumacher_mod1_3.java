// cschumacher_06142026_mod1_3 
import java.util.Scanner;

public class schumacher_mod1_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = scanner.nextDouble();

        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = scanner.nextDouble();

        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        System.out.printf("Energy needed to heat the water: %.2f Joules%n", Q);

        scanner.close();
    }
}
