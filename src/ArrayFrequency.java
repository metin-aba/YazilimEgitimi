import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayFrequency {
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

        Map<Integer, Integer> frequencyMap = calculateFrequency(array);

        System.out.println("Dizi elemanlarının frekansı:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }

    public static Map<Integer, Integer> calculateFrequency(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        return frequencyMap;
    }
}
