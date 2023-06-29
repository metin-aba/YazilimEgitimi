import java.util.ArrayList;
import java.util.List;

class Sigorta {
    private String poliçeNumarası;
    private String poliçeSahibiAdı;
    private double primMiktarı;

    public Sigorta(String poliçeNumarası, String poliçeSahibiAdı, double primMiktarı) {
        this.poliçeNumarası = poliçeNumarası;
        this.poliçeSahibiAdı = poliçeSahibiAdı;
        this.primMiktarı = primMiktarı;
    }

    public String getPoliçeNumarası() {
        return poliçeNumarası;
    }

    public String getPoliçeSahibiAdı() {
        return poliçeSahibiAdı;
    }

    public double getPrimMiktarı() {
        return primMiktarı;
    }
}

class SigortaYönetimSistemi {
    private List<Sigorta> sigortaListesi;

    public SigortaYönetimSistemi() {
        sigortaListesi = new ArrayList<>();
    }

    public void sigortaEkle(Sigorta sigorta) {
        sigortaListesi.add(sigorta);
    }

    public void sigortaSil(Sigorta sigorta) {
        sigortaListesi.remove(sigorta);
    }

    public List<Sigorta> tümSigortalarıAl() {
        return sigortaListesi;
    }

    public double toplamPrimMiktarınıAl() {
        double toplamPrim = 0.0;
        for (Sigorta sigorta : sigortaListesi) {
            toplamPrim += sigorta.getPrimMiktarı();
        }
        return toplamPrim;
    }
}

public class SigortaYönetimSistemiApp {
    public static void main(String[] args) {
        Sigorta sigorta1 = new Sigorta("12345", "Ahmet Yılmaz", 1500.0);
        Sigorta sigorta2 = new Sigorta("67890", "Ayşe Demir", 2000.0);

        SigortaYönetimSistemi sigortaYönetimSistemi = new SigortaYönetimSistemi();
        sigortaYönetimSistemi.sigortaEkle(sigorta1);
        sigortaYönetimSistemi.sigortaEkle(sigorta2);

        double toplamPrimMiktarı = sigortaYönetimSistemi.toplamPrimMiktarınıAl();

        System.out.println("Sigorta Yönetim Sistemi Toplam Prim Miktarı: " + toplamPrimMiktarı);
    }
}
