import java.util.Scanner;

public class Pemilihan2Percobaan115 {
    public static void main(String[] args){
        Scanner input15 = new Scanner(System.in);
        
        System.out.print("Masukkan Tahun: ");
        int tahun15 = input15.nextInt();

        if (tahun15 % 4 == 0)
            if (tahun15 % 100 == 0){
                System.out.println("Tahun Kabisat");
        }   else 
                System.out.println("Bukan Tahun Kabisat");
    }
}