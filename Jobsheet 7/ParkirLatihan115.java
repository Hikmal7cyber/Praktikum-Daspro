import java.util.Scanner;

public class ParkirLatihan115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, total = 0, durasi, durasiTotal = 0;

        do {
            System.out.println("=================================");
            System.out.println("---- Masukan jenis kendaraan ----");
            System.out.println("=================================");
            System.out.println(" 1. Mobil");
            System.out.println(" 2. Motor");
            System.out.println(" 0 (keluar)");
            System.out.println("=================================");
            System.out.print("jenis kendaraan :  ");
            jenis = sc.nextInt();
    
            if ( jenis==0) {
                break;
            } 
            System.out.print("Durasi parkir (dalam jam) : ");
            durasi = sc.nextInt();
            System.out.println("----------------------------------");
    
            if ( durasi > 5) {
                total += 12500;
            } else if (jenis== 1) {
                total += durasi * 3000;
            } else if (jenis== 2) {
                total += durasi * 2000;
            }
            
            durasiTotal += durasi;
    
        } while (true);

            System.out.println("----------------------------------");
            System.out.println("KENDARAAN TELAH PARKIR SELAMA " + durasiTotal + " JAM");
            System.out.println("KENDARAAN DIKENAKAN BIAYA SEBESAR Rp " + total);
            System.out.println("----------------------------------");

            System.out.println("============= TRANSAKSI SELESAI ==============");
            
    }
}

        

