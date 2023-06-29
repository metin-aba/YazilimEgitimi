import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum yılınızı girin: ");
        int dogumYili = scanner.nextInt();

        String cinZodyagi = cinZodyagiHesapla(dogumYili);

        if (!cinZodyagi.isEmpty()) {
            System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi);
        } else {
            System.out.println("Geçersiz doğum yılı girişi!");
        }

        scanner.close();
    }

    public static String cinZodyagiHesapla(int dogumYili) {
        if (dogumYili <= 0) {
            return "";
        }

        String[] zodyakListesi = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
        int baslangicYili = 1900; // Çin Zodyağı döngüsünün başlangıç yılı
        int indeks = (dogumYili - baslangicYili) % 12; // Zodyak indeksi hesaplanır

        return zodyakListesi[indeks];
    }
}
