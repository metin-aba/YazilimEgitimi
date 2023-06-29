import java.util.ArrayList;
import java.util.List;

class Kitap {
    private String ad;
    private String yazar;
    private int sayfaSayisi;

    public Kitap(String ad, String yazar, int sayfaSayisi) {
        this.ad = ad;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getAd() {
        return ad;
    }

    public String getYazar() {
        return yazar;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }
}

public class KitapListesi {
    public static void main(String[] args) {
        List<Kitap> kitapListesi = new ArrayList<>();

        // Kitapları oluştur ve listeye ekle
        Kitap kitap1 = new Kitap("Kırmızı Pazartesi", "Gabriel Garcia Marquez", 200);
        Kitap kitap2 = new Kitap("Beyaz Zambaklar Ülkesinde", "Grigory Petrov", 300);
        Kitap kitap3 = new Kitap("1984", "George Orwell", 350);

        kitapListesi.add(kitap1);
        kitapListesi.add(kitap2);
        kitapListesi.add(kitap3);

        // Kitap listesini dolaşarak bilgileri yazdır
        for (Kitap kitap : kitapListesi) {
            System.out.println("Kitap Adı: " + kitap.getAd());
            System.out.println("Yazar: " + kitap.getYazar());
            System.out.println("Sayfa Sayısı: " + kitap.getSayfaSayisi());
            System.out.println("-------------------------");
        }
    }
}
