import java.util.Scanner;

public class SearchNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt();

        int [] arrNilai = new int [jmlMhs];

        for (int i = 0; i<arrNilai.length;i++){
            System.out.print("Masukkan nilai mahasiswa ke- " + (i+1)+":");
            arrNilai [i] = sc.nextInt();
        }

        System.out.println("Masukan nilai yang ingin dicari : ");
        int key = sc.nextInt();
        int hasil = -1;

        for (int i=0; i<arrNilai.length; i++) {
            if (key ==arrNilai [i]) {
                hasil = i;
                break;
            }
        }
         if (hasil != -1) {
            System.out.println("Nilai " + key + " berhasil ditemukan, angka tersebut merupakan nilai mahasiswa ke - " + hasil);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan dalam array.");
        }

    }
}
