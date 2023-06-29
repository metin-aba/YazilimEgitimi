import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Seyahat mesafesini girin (km): ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı girin: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini seçin (Tek yön için 1, Gidiş-dönüş için 2): ");
        int yolculukTipi = scanner.nextInt();

        double biletFiyati = biletFiyatiHesapla(mesafe, yas, yolculukTipi);

        if (biletFiyati > 0) {
            System.out.println("Toplam bilet fiyatı: " + biletFiyati + " TL");
        } else {
            System.out.println("Hatalı giriş yapıldı!");
        }

        scanner.close();
    }

    public static double biletFiyatiHesapla(int mesafe, int yas, int yolculukTipi) {
        if (mesafe < 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            return -1; // Hatalı giriş durumu için -1 döndürülür.
        }

        double biletFiyati = mesafe * 0.10; // Mesafe başına ücret
        double indirimOrani = 0;

        if (yas < 12) {
            indirimOrani = 0.50; // 12 yaşından küçükler için %50 indirim
        } else if (yas >= 12 && yas <= 24) {
            indirimOrani = 0.10; // 12-24 yaş arası için %10 indirim
        } else if (yas >= 65) {
            indirimOrani = 0.30; // 65 yaş ve üstü için %30 indirim
        }

        biletFiyati -= biletFiyati * indirimOrani; // İndirim uygulanır

        if (yolculukTipi == 2) {
            biletFiyati *= 2; // Gidiş-dönüş bileti için fiyat 2 katına çıkar
        }

        return biletFiyati;
    }
}
