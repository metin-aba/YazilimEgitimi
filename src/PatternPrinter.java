public class PatternPrinter {
    public static void main(String[] args) {
        printPattern(5); // Desenin boyutunu belirtin
    }

    public static void printPattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
