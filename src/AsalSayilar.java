public class AsalSayilar {
    public static void main(String[] args) {
        System.out.println("1-100 arasindaki asal sayilar:");
        asalSayilariBul(1, 100);
    }

    public static void asalSayilariBul(int baslangic, int bitis) {
        for (int i = baslangic; i <= bitis; i++) {
            if (asalMi(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean asalMi(int sayi) {
        if (sayi < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }

        return true;
    }
}
