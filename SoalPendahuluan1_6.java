package NPM07066soalPendahuluan1_6;

import java.util.Scanner;

public class NPM07066soalPendahuluan1_6 {
    static void menu() {
        System.out.println("=======");
        System.out.println("1. Prosedur luas lingkaran");
        System.out.println("2. Fungsi luas lingkaran");
        System.out.println("3. Fungsi bangun lingkaran");
        System.out.println("4. Fungsi bangun tabung");
    }

    static void procedureLuasLingkaran(double diameter) {
        double jari = diameter / 2;
        double luas = jari * 3.14 * 3.14;
        System.out.println("Luas lingkaran adalah " + luas);
    }

    static double fungsiLuasLingkaran(double diameter) {
        double jari = diameter / 2;
        double luas = jari * 3.14 * 3.14;
        return luas;
    }

    static double[] fungsiLingkaran(double diameter) {
        double[] hasil = new double[2];
        double jari = diameter / 2;
        double luas = jari * 3.14 * 3.14;
        double keliling = jari * 2 * 3.14;
        hasil[0] = luas;
        hasil[1] = keliling;
        return hasil;
    }

    static double fungsiTabung(double d, int t) {
        double jari = d / 2;
        double luas = jari * 3.14 * 3.14;
        double volume = luas * t;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan diameter (meter) : ");
        double dm = input.nextDouble();


        menu();
        System.out.print("Masukan pilihan : ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                procedureLuasLingkaran(dm);
                break;
            case 2:
                double luas = fungsiLuasLingkaran(dm);
                System.out.println("Luas lingkaran " + luas);
                break;
            case 3:
                double[] hasil = fungsiLingkaran(dm);
                System.out.println("Luas lingkaran adalah " + hasil[0]);
                System.out.println("Keliling lingkaran adalah " + hasil[1]);
                break;
            case 4:
                System.out.print("Masukan tinggi (meter): ");
                int tinggi = input.nextInt();
                double volume = fungsiTabung(dm, tinggi);
                double konversi = volume * 100;
                System.out.println("Volume tabung adalah " + konversi + " (cm^3)");
                break;
        }
    }
}
