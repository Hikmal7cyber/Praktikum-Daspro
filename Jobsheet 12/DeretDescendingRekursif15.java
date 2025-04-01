import java.util.Scanner;
public class DeretDescendingRekursif15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        System.out.print("Hasil (rekursif):  ");
        descendingRekursif(angka);
        System.out.println();

        System.out.print("Hasil (iteratif):  ");
        descendingIteratif(angka);
    }

    static void descendingRekursif(int angka) {
        if (angka < 0) {
            return;
        }
        System.out.print(angka + " "); 
        descendingRekursif(angka - 1); 
    }

    static void descendingIteratif(int angka) {
        for (int i = angka; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
