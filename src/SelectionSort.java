public class SelectionSort {
    public static void main(String[] args) {
        int[] dizi = {7, 2, 9, 1, 5};

        System.out.println("Sıralanmamış dizi: ");
        diziYazdir(dizi);

        selectionSort(dizi);

        System.out.println("Sıralanmış dizi: ");
        diziYazdir(dizi);
    }

    public static void selectionSort(int[] dizi) {
        int n = dizi.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (dizi[j] < dizi[minIndex]) {
                    minIndex = j;
                }
            }

            // Minimum elemanın yerini değiştir
            int temp = dizi[minIndex];
            dizi[minIndex] = dizi[i];
            dizi[i] = temp;
        }
    }

    public static void diziYazdir(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println();
    }
}
