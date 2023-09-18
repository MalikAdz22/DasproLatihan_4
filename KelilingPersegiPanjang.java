package daspro_latihan4;

import java.util.Scanner;
public class KelilingPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double panjang, lebar, keliling;

        System.out.println("***KELILING PERSEGI PANJANG ***");
        System.out.print("Masukkan Panjang :");
        panjang = input.nextDouble();

        System.out.print("Masukan Lebar :");
        lebar = input.nextDouble();

        keliling = 2*( panjang + lebar);
        System.out.println("Luas Persegi Panjang Adalah"+ keliling);


        
    }
}