import java.util.Scanner;

public class Pemilihan2Percobaan215 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        int pilihan_menu, harga_bayar, harga;
        double diskon, total_bayar, qris = 1000;
        String member, bayarQris;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.println("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input15.nextInt();
        input15.nextLine();
        System.out.println("Apakah mempunyai member (y/n) ? = ");
        member = input15.nextLine();
        System.out.println("Apakah membayar menggunakan Qris (y/n) ? = ");
        bayarQris = input15.nextLine();
        System.out.println("--------------------------------------");

    if (bayarQris.equalsIgnoreCase("y")) {
        System.out.println("Potongan Qris = Rp 1.000");
    }
        
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl =" + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
        
            }else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + (total_bayar - qris));
        
        }else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            }else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
        System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }

        System.out.println("----------------------------------------");  

    } 
}
