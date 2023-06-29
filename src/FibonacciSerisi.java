import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet Fibonacci sayısı görmek istiyorsunuz? ");
        int adet = scanner.nextInt();

        System.out.println(adet + " adet Fibonacci sayısı:");
        fibonacciSerisi(adet);

        scanner.close();
    }

    public static void fibonacciSerisi(int adet) {
        int ilkSayi = 0;
        int ikinciSayi = 1;

        for (int i = 1; i <= adet; i++) {
            System.out.print(ilkSayi + " ");

            int toplam = ilkSayi + ikinciSayi;
            ilkSayi = ikinciSayi;
            ikinciSayi = toplam;
        }

        System.out.println();
    }
}
