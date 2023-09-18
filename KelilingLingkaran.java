package daspro_latihan4;

import java.util.Scanner;

public class KelilingLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, keliling, phi = 3.14;

        System.out.println("*** KELILING LINGKARAN ***");
        System.out.print("Masukan Jari - jari :");
        r = input.nextDouble();

        keliling = 2* phi * r ;
        System.out.println("Keliling Lingkaran adalah "+ keliling);

    }
}
