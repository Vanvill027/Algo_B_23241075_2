import java.util.Scanner;
class Mencari_percepatan_dan_kecepatan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // mencari kecepatan

        System.out.print("Masukkan jarak tempuh (dalam bentuk meter): ");
        double jarakTempuh = scanner.nextDouble();
        System.out.print("Masukkan waktu tempuh (dalam satuan detik): ");
        double waktutempuh = scanner.nextDouble();
        double kecepatan = jarakTempuh / waktutempuh;
        System.out.println("Kecepatan adalah " + kecepatan + "m/s");

        // mencari percepatan
        System.out.println("Masukkan kecepatan awal (dalam satuan m/s): ");
        double KecepatanAwal = scanner.nextDouble();
        System.out.println("Masukkan waktu (dalam satuan detik): ");
        double waktu = scanner.nextDouble();
        System.out.println("Masukkan perubahan kecepatan setelah waktu (dalam satuan m/s): ");
        double perubahanKecepatanSetelahWaktu = scanner.nextDouble();
        double percepatan = (perubahanKecepatanSetelahWaktu-KecepatanAwal)/waktu;
        System.out.println("Percepatan adalah: " + percepatan + " m/s^2 ");

        scanner.close();

     }
    }