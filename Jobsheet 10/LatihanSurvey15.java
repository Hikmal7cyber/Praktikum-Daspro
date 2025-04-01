import java.util.Scanner;
public class LatihanSurvey15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] hasilSurvey = new int[10][6];

        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("Tingkat Kepuasan " + (j + 1) + " (1-5): ");
                hasilSurvey[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("Rata-rata nilai untuk setiap responden:");
        for (int i = 0; i < 10; i++) {
            double total = 0;
            for (int j = 0; j < 6; j++) {
                total += hasilSurvey[i][j];
            }
            double rataRataResponden = total / 6;
            System.out.printf("Responden %d: %.2f%n", (i + 1), rataRataResponden);
        }

        System.out.println("\nRata-rata nilai untuk setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            double total = 0;
            for (int i = 0; i < 10; i++) {
                total += hasilSurvey[i][j];
            }
            double rataRataPertanyaan = total / 10;
            System.out.printf("Pertanyaan %d: %.2f%n", (j + 1), rataRataPertanyaan);
        }

        double totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += hasilSurvey[i][j];
            }
        }
        double rataRataKeseluruhan = totalKeseluruhan / (10 * 6);
        System.out.printf("%nRata-rata nilai secara keseluruhan: %.2f%n", rataRataKeseluruhan);

        scanner.close();
    }
}