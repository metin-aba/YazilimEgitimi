import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi uzunluğunu girin: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < length; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Sıralanmamış dizi: " + Arrays.toString(array));

        // Dizi elemanlarını sıralama
        Arrays.sort(array);

        System.out.println("Sıralanmış dizi: " + Arrays.toString(array));

        scanner.close();
    }
}
