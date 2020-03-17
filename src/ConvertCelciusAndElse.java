import java.util.Scanner;

public class ConvertCelciusAndElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the Celsius : ");
        double cel = scanner.nextDouble();
        System.out.printf("Enter the fahrenheit : ");
        double fah = scanner.nextDouble();

        double newFah = celsiusConvertToFahrenheit(cel);
        System.out.printf("celsius: %.1f -->> fahrenheit: %.1f ", cel, newFah);

        double newCel = fahrenheitConvertToCelsius(fah);
        System.out.printf("celsius: %.1f -->> fahrenheit: %.1f ", fah, newCel);

    }

    public static double fahrenheitConvertToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static double celsiusConvertToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }
}
