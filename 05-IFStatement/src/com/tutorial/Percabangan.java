package com.tutorial;
import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        
        // Data Member
        int total_belanja,bayar,diskon;
        String member;
        
        // Membuat Scanner Menerima Input dari Keyboard
        Scanner scan = new Scanner(System.in);

        // Mengambil Input dari Keyboard
        System.out.print("Apakah Anda Member (Iya/Tidak): ");
        member = scan.nextLine();
        System.out.print("Masukkan Total Belanja : ");
        total_belanja = scan.nextInt();

        // IF Statement
        // Member Toko
        if (member.equalsIgnoreCase("Iya")) {
        if (total_belanja >= 500000) {
            System.out.println("Selamat Anda mendapatkan diskon Rp. 50.000");
            diskon = 50000;
        } else if (total_belanja >= 100000) {
            System.out.println("Selamat Anda mendapatkan diskon Rp.15.000");
            diskon = 15000;
        }else{
            diskon = 0;
            System.out.println("Anda tidak mendapatkan diskon");
        }

        //Bukan Member Toko
        }else{
            if (total_belanja >= 100000) {
                diskon = 10000;
                System.out.println("Selamat Anda mendapatkan Rp.10.000");
            }else{
                diskon = 0;
                System.out.println("Anda tidak mendapatkan Diskon");
            }
        }
        bayar = total_belanja-diskon;
        System.out.println("Total biaya Anda: Rp" + bayar);

    }
}
