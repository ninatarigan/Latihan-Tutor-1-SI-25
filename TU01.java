import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y, jumlah, kali;

        x = input.nextInt();
        y = input.nextInt();
        if (x % 2 == 0) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan ganjil");
        }
        if (y % 2 == 0) {
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Bilangan ganjil");
        }
        if (x > y) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (x == y) {
                System.out.println("Kedua bilangan sama besar");
            } else {
                System.out.println("Bilangan kedua lebih besar");
            }
        }
        if (x % 2 == 0 && y % 2 == 0) {
            jumlah = x + y;
            System.out.println("Hasil penjumlahan " + jumlah);
        } else {
            if (x % 2 == 1 && y % 2 == 1) {
                kali = x * y;
                System.out.println("Hasil perkalian " + kali);
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
