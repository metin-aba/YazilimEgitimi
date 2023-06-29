public class ThreadYarisi {
    public static void main(String[] args) {
        // Yarışı tamamlayacak Thread sınıfı
        class Yarisci implements Runnable {
            private String isim;
            private long baslangicZamani;

            public Yarisci(String isim) {
                this.isim = isim;
            }

            @Override
            public void run() {
                System.out.println(isim + " yarışa başladı!");
                baslangicZamani = System.currentTimeMillis();

                // Rastgele bir mesafe koş
                double mesafe = Math.random() * 100;
                try {
                    Thread.sleep((long) (mesafe / 10)); // Mesafe üzerinden uyku süresi hesapla
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                long bitisZamani = System.currentTimeMillis();
                System.out.println(isim + " yarışı tamamladı! Toplam süre: " + (bitisZamani - baslangicZamani) + "ms");
            }
        }

        // Thread nesnelerini oluştur
        Thread thread1 = new Thread(new Yarisci("Yarışçı 1"));
        Thread thread2 = new Thread(new Yarisci("Yarışçı 2"));
        Thread thread3 = new Thread(new Yarisci("Yarışçı 3"));

        // Yarışçıları başlat
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
