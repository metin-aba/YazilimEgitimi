public class MergeSort {
    public static void main(String[] args) {
        int[] dizi = {7, 2, 9, 1, 5};

        System.out.println("Sıralanmamış dizi: ");
        diziYazdir(dizi);

        mergeSort(dizi, 0, dizi.length - 1);

        System.out.println("Sıralanmış dizi: ");
        diziYazdir(dizi);
    }

    public static void mergeSort(int[] dizi, int sol, int sag) {
        if (sol < sag) {
            int orta = (sol + sag) / 2;

            mergeSort(dizi, sol, orta);
            mergeSort(dizi, orta + 1, sag);

            birlestir(dizi, sol, orta, sag);
        }
    }

    public static void birlestir(int[] dizi, int sol, int orta, int sag) {
        int n1 = orta - sol + 1;
        int n2 = sag - orta;

        int[] solDizi = new int[n1];
        int[] sagDizi = new int[n2];

        for (int i = 0; i < n1; i++) {
            solDizi[i] = dizi[sol + i];
        }
        for (int j = 0; j < n2; j++) {
            sagDizi[j] = dizi[orta + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = sol;

        while (i < n1 && j < n2) {
            if (solDizi[i] <= sagDizi[j]) {
                dizi[k] = solDizi[i];
                i++;
            } else {
                dizi[k] = sagDizi[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            dizi[k] = solDizi[i];
            i++;
            k++;
        }

        while (j < n2) {
            dizi[k] = sagDizi[j];
            j++;
            k++;
        }
    }

    public static void diziYazdir(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println();
    }
}
