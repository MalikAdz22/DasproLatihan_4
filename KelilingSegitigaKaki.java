package daspro_latihan4;

import java.util.Scanner;
public class KelilingSegitigaKaki {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sisi_a, sisi_b, sisi_c, keliling;

        System.out.println("*** KELILING SEGITIGA SAMA KAKI ***");

        System.out.print("Masukan panjang sisi A :");
        sisi_a = input.nextDouble();
        System.out.print("Masukan panjang sisi B:");
        sisi_b = input.nextDouble();    
        System.out.print("Masukan panjang sisi C :");
        sisi_c = input.nextDouble();

        keliling = sisi_a + sisi_b + sisi_c;
        System.out.println("Keliling Segitiga adalah "+ keliling);
        


    }
}