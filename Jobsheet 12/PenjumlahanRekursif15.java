import java.util.Scanner;
public class PenjumlahanRekursif15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        System.out.print("======= KALKULATOR PENJUMLAHAN REKURSIF =======");
        System.out.println();
        System.out.print("Masukkan angka bebas untuk dijumlahkan: ");
        int f = sc15.nextInt();

        System.out.print("Hasil: ");
        tampilkanDeretPenjumlahan(f, 1);  

        int hasil = hitungPenjumlahan(f);
        System.out.println(" = " + hasil);
    }

    static int hitungPenjumlahan(int n) {
        if (n == 0) {
            return (0); 
        } else {
            return n + hitungPenjumlahan(n - 1); 
        }
    }

    static void tampilkanDeretPenjumlahan(int n, int angka) {
        if (angka > n) {
            return; 
        }
        System.out.print(angka);
        if (angka < n) {
            System.out.print(" + ");
        }
        tampilkanDeretPenjumlahan(n, angka + 1);
    }
}


