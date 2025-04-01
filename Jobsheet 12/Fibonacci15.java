public class Fibonacci15 {
    static int fibonacci(int bulan){
        if (bulan == 1  || bulan == 2) {
            return (1);
        }else{
            return fibonacci(bulan - 1) + fibonacci(bulan -2);
        }
    }
    public static void main(String[] args) {
        int bulan = 12;
        fibonacci(bulan);
        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulan + " adalah " + fibonacci(bulan));
    }
}
