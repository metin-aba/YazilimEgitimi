import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saatlik ücreti girin: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Haftalık çalışma saati: ");
        int weeklyHours = scanner.nextInt();

        double weeklySalary = calculateWeeklySalary(hourlyRate, weeklyHours);
        double monthlySalary = calculateMonthlySalary(weeklySalary);

        System.out.println("Haftalık maaş: " + weeklySalary);
        System.out.println("Aylık maaş: " + monthlySalary);

        scanner.close();
    }

    public static double calculateWeeklySalary(double hourlyRate, int weeklyHours) {
        double weeklySalary = hourlyRate * weeklyHours;
        return weeklySalary;
    }

    public static double calculateMonthlySalary(double weeklySalary) {
        double monthlySalary = weeklySalary * 4; // Varsayılan olarak 4 hafta olduğu kabul edilmiştir
        return monthlySalary;
    }
}
