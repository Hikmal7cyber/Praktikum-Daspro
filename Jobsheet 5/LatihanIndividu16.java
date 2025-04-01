import java.util.Scanner;

public class LatihanIndividu16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan usia Anda: ");
    int age = scanner.nextInt();

    if (age < 0) 
    {
      System.out.println("Tidak memenuhi: Usia harus berupa angka positif.");
    } 
    else if (age <= 12) 
    {
      System.out.println("Anda dikategorikan sebagai ANAK");
    } 
    else if (age <= 19) 
    {
      System.out.println("Anda dikategorikan sebagai REMAJA");
    } 
    else if (age <= 64) 
    {
      System.out.println("Anda dikategorikan sebagai DEWASA");
    } 
    else 
    {
      System.out.println("Anda dikategorikan sebagai LANSIA");
    }
  }
}