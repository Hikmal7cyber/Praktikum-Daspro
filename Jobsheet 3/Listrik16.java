import java.util.Scanner;
public class Listrik16 {
    public static void main(String[] args){
        int tarif_PerKWH = 1500;
        int batas_KWH = 500;

        Scanner input  = new Scanner(System.in);
        System.out.print("Masukkan jumlah penggunaan: ");
        int pemakaianKWH = input.nextInt();
        boolean melewatiBatas = pemakaianKWH > batas_KWH;
        int totalTagihan = pemakaianKWH * tarif_PerKWH;
        
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("Penggunaan melebihi batas: " + melewatiBatas);
    }
}