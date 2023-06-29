import java.util.Scanner;

public class ExponentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double result = calculateExponent(base, exponent);
        System.out.println("Result: " + result);

        scanner.close();
    }

    // Calculates the exponent of a given base number
    public static double calculateExponent(double base, int exponent) {
        double result = 1;

        if (exponent >= 0) {
            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
        } else {
            for (int i = 1; i <= Math.abs(exponent); i++) {
                result /= base;
            }
        }

        return result;
    }
}
