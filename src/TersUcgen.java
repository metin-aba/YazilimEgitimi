import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ters üçgenin yüksekliğini girin: ");
        int yukseklik = scanner.nextInt();

        tersUcgenOlustur(yukseklik);

        scanner.close();
    }

    public static void tersUcgenOlustur(int yukseklik) {
        for (int i = yukseklik; i >= 1; i--) {
            for (int j = yukseklik; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
