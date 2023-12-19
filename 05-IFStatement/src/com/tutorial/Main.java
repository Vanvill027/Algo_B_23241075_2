package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Data Memeber
        int total_belanja = 0;

        //Membuat Scanner Menerima Input dari Keyboard
        Scanner scan = new Scanner(System.in);

        //Mengambil Input dari Keyboard
        System.out.print("Masukkan Total Belanja : ");
        total_belanja = scan.nextInt();

        //Cek Total Belanja
        if (total_belanja >= 50000) {
            System.out.println("Anda Mendapatkan Hadiah Bonus Mouse");
        } else {
            System.out.println("Belanja Anda Kurang dari Rp. 50000 untuk mendapatkan Bonus Belanja");
        }

        System.out.println("Terima Kasih telah Berbelanja di Toko Kami");
    }
}
