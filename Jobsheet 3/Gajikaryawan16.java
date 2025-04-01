import java.util.Scanner;

public class Gajikaryawan16 {
    public static void main(String[] args) {
        
        final double bonus = 0.10;
        final double pajak = 0.05;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jam kerja karyawan dalam sebulan: ");
        double jamKerja = input.nextDouble();
        System.out.print("Masukkan upah kerja per jam: ");
        double upahPerjam = input.nextDouble();

        double gajiSebelumpajak = jamKerja = upahPerjam;
        double bonuss = gajiSebelumpajak * bonus;
        double totalGajisebelumpajak = gajiSebelumpajak;
        double pajakk = totalGajisebelumpajak * pajak;
        double gajiBersih = totalGajisebelumpajak - pajak;

        System.out.println("Gaji sebelum pajak: "+ gajiSebelumpajak);
        System.out.println("Bonus: "+ bonus);
        System.out.println("Total gaji sebelum pajak: "+ totalGajisebelumpajak);
        System.out.println("Gaji bersih setelah pajak: "+ gajiBersih);
    }
}