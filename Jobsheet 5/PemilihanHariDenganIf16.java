import java.util.Scanner;

public class PemilihanHariDenganIf16 {
    public static void main (String[] args){

        Scanner input = new Scanner (System.in);

        System.out.print("MASUKKAN SEBUAH ANGKA SESUAI URUTAN HARI: ");
        int hari = input.nextInt();

        if (hari >= 1 && hari <= 5)
        {
            System.out.println("Angka tersebut termasuk Weekday");
        }
        else if (hari == 6 || hari == 7)
        {
            System.out.println("Angka tersebut termasuk Weekend");
        }
        else
        {
            System.out.println("Invalid number");
        }

    }
}