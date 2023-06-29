import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz? ");
        int sayiAdedi = scanner.nextInt();

        int[] sayilar = new int[sayiAdedi];

        for (int i = 0; i < sayiAdedi; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            sayilar[i] = scanner.nextInt();
        }

        int min = sayilar[0]; // Minimum değeri saklamak için ilk sayıyı atıyoruz
        int max = sayilar[0]; // Maksimum değeri saklamak için ilk sayıyı atıyoruz

        for (int i = 1; i < sayiAdedi; i++) {
            if (sayilar[i] < min) {
                min = sayilar[i];
            }

            if (sayilar[i] > max) {
                max = sayilar[i];
            }
        }

        System.out.println("Minimum değer: " + min);
        System.out.println("Maksimum değer: " + max);

        scanner.close();
    }
}
