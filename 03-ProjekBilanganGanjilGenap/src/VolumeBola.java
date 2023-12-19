import java.util.Scanner;
class Menghitung_volume_bola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // menghitung volume vola
        double phi = 22/7;

        System.out.print("Masukkan Jari-Jari Bola (dalam bentuk cm): ");
        double Jarijaribola = scanner.nextDouble();
        double Volume = 4/3*phi*Jarijaribola*Jarijaribola*Jarijaribola;
        System.out.println("Volume bola = " + Volume + "cm^3");

        scanner.close();
     }
    }