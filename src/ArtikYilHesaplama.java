import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yılı girin: ");
        int yil = scanner.nextInt();

        boolean artikYilMi = artikYilHesapla(yil);

        if (artikYilMi) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }

        scanner.close();
    }

    public static boolean artikYilHesapla(int yil) {
        // Bir yılın artık yıl olabilmesi için 4'e tam bölünmesi gerekmektedir.
        // Ancak 100'e tam bölünen yılların artık yıl olabilmesi için aynı zamanda 400'e de tam bölünmesi gerekmektedir.

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
