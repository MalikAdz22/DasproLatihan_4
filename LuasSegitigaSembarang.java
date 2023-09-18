package daspro_latihan4;

import java.util.Scanner;

public class LuasSegitigaSembarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double alas, tinggi, luas;

        System.out.println("*** LUAS SEGITIGA SEMBARANG ***");

        System.out.print("Masukkan Alas :");
        alas = input.nextDouble();
        System.out.println("Masukan Tinggi :");
        tinggi = input.nextDouble();

        luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga Adalah"+ luas);

    }
}
