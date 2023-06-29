import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double toplamFiyat = 0;

        while (true) {
            System.out.print("Ürün adı girin (çıkmak için 'q' tuşuna basın): ");
            String urunAdi = scanner.nextLine();

            if (urunAdi.equalsIgnoreCase("q")) {
                break;
            }

            System.out.print("Birim fiyatı girin: ");
            double birimFiyat = scanner.nextDouble();

            System.out.print("Miktarı girin: ");
            int miktar = scanner.nextInt();
            scanner.nextLine();

            double urunFiyati = birimFiyat * miktar;
            toplamFiyat += urunFiyati;

            System.out.println(urunAdi + " için toplam fiyat: " + urunFiyati + " TL\n");
        }

        System.out.println("Toplam ödeme tutarı: " + toplamFiyat + " TL");
        scanner.close();
    }
}
