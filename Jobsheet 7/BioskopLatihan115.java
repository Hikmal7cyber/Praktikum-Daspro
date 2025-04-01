import java.util.Scanner;

public class BioskopLatihan115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hargaTiket = 50000, terjual = 0, totalPendapatan = 0, jumlahTiket, tiketTerjual = 0;

        System.out.println("----------------------------------------------------------------------");
        System.out.println("============ REKAPITULASI PENJUALAN BIOSKOP 'KANGEN KAMU' ============");
        System.out.println("----------------------------------------------------------------------");

        do {
            System.out.print("Masukkan jumlah tiket yang ingin dijual (atau -1000 untuk selesai): ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket == -1000) {
                break;
            }if (jumlahTiket < 0) {
                System.out.println("MASUKKAN JUMLAH TIKET DENGAN BENAR. Silakan coba lagi!");
                continue;
            }

            double diskon = 0;
            if (jumlahTiket > 4) {
                diskon = 0.1; 
            } else if (jumlahTiket > 10) {
                diskon = 0.15; 
            }
            int totalHarga = (int) (jumlahTiket * hargaTiket * (1 - diskon));
            tiketTerjual += jumlahTiket;
            totalPendapatan += totalHarga;

            System.out.println("TOTAL PENDAPATAN HARI INI SEBESAR : Rp " + totalPendapatan);
            System.out.println("JUMLAH TIKET YANG TERJUAL SEBANYAK : " + tiketTerjual + " BUAH");
        }while(true);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Transaksi hari ini telah selesai. Have a nice day :)");
        System.out.println("----------------------------------------------------------------------");

    }
}

