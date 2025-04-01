import java.util.Scanner;

public class TugasKetiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar","Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cariMakanan = sc.nextLine().toLowerCase();

        boolean ditemukan = false;

        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(cariMakanan)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println(cariMakanan + " tersedia di menu.");
        } else {
            System.out.println(cariMakanan + " tidak ada di menu.");
        }

    }
}
