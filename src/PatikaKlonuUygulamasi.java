import java.util.ArrayList;
import java.util.List;

class Kullanici {
    private String kullaniciAdi;
    private String sifre;
    private List<Ders> kayitliDersler;

    public Kullanici(String kullaniciAdi, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.kayitliDersler = new ArrayList<>();
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public boolean sifreDogrula(String girilenSifre) {
        return sifre.equals(girilenSifre);
    }

    public void dersKaydet(Ders ders) {
        kayitliDersler.add(ders);
    }

    public List<Ders> getKayitliDersler() {
        return kayitliDersler;
    }
}

class Ders {
    private String dersAdi;

    public Ders(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public String getDersAdi() {
        return dersAdi;
    }
}

class PatikaKlonu {
    private List<Ders> dersler;
    private List<Kullanici> kullaniciListesi;

    public PatikaKlonu() {
        dersler = new ArrayList<>();
        kullaniciListesi = new ArrayList<>();
    }

    public void dersEkle(Ders ders) {
        dersler.add(ders);
    }

    public void kullaniciEkle(Kullanici kullanici) {
        kullaniciListesi.add(kullanici);
    }

    public List<Ders> getDersler() {
        return dersler;
    }

    public Kullanici kullaniciGiris(String kullaniciAdi, String sifre) {
        for (Kullanici kullanici : kullaniciListesi) {
            if (kullanici.getKullaniciAdi().equals(kullaniciAdi) && kullanici.sifreDogrula(sifre)) {
                return kullanici;
            }
        }
        return null;
    }
}

public class PatikaKlonuUygulamasi {
    public static void main(String[] args) {
        PatikaKlonu patika = new PatikaKlonu();

        // Dersler oluşturulur
        Ders ders1 = new Ders("Java Programlama");
        Ders ders2 = new Ders("Veritabanı Yönetimi");
        Ders ders3 = new Ders("Web Geliştirme");

        // Dersler Patika'ya eklenir
        patika.dersEkle(ders1);
        patika.dersEkle(ders2);
        patika.dersEkle(ders3);

        // Kullanıcılar oluşturulur
        Kullanici kullanici1 = new Kullanici("kullanici1", "123456");
        Kullanici kullanici2 = new Kullanici("kullanici2", "abcdef");

        // Kullanıcılar Patika'ya eklenir
        patika.kullaniciEkle(kullanici1);
        patika.kullaniciEkle(kullanici2);

        // Kullanıcılar derslere kaydolur
        kullanici1.dersKaydet(ders1);
        kullanici1.dersKaydet(ders2);
        kullanici2.dersKaydet(ders2);
        kullanici2.dersKaydet(ders3);

        // Kullanıcıların kayıtlı dersleri listelenir
        System.out.println("kullanici1'in Kayıtlı Dersleri:");
        List<Ders> kullanici1Dersler = kullanici1.getKayitliDersler();
        for (Ders ders : kullanici1Dersler) {
            System.out.println(ders.getDersAdi());
        }

        System.out.println("-------------------------");

        System.out.println("kullanici2'nin Kayıtlı Dersleri:");
        List<Ders> kullanici2Dersler = kullanici2.getKayitliDersler();
        for (Ders ders : kullanici2Dersler) {
            System.out.println(ders.getDersAdi());
        }
    }
}
