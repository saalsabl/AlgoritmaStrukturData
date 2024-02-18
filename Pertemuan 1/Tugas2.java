import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program menghitung kecepatan, jarak, dan waktu");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");

        System.out.print("Pilih salah satu (1/2/3) : ");
        int pilihan = sc.nextInt();

        if (pilihan < 1 || pilihan > 3){
            System.out.println("Pilihan tidak valid.");
            System.exit(0);
        }
        switch (pilihan){
            case 1 :
            hitungKecepatan();
            break;
            case 2 :
            hitungJarak();
            break;
            case 3 :
            hitungWaktu();
            break;
        }
        sc.close();
    }
    public static void hitungKecepatan(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jarak (dalam kilometer) : ");
        double jarak = sc.nextDouble();
        System.out.print("Masukkan waktu (dalam jam) : ");
        double waktu = sc.nextDouble();

        double kecepatan = jarak/waktu;
        System.out.println("Hasil perhitungan Kecepatan : " + kecepatan + "km/jam");

        sc.close();
    }
    public static void hitungJarak(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (dalam km/jam) : ");
        double kecepatan = sc.nextDouble();
        System.out.print("Masukkan waktu (dalam jam) : ");
        double waktu = sc.nextDouble();

        double jarak = kecepatan*waktu;

        System.out.println("Hasil perhitungan Jarak : " + jarak + "kilometer");

        sc.close();
    }
    public static void hitungWaktu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak (dalam kilometer : )");
        double jarak = sc.nextDouble();
        System.out.print("Masukkan kecepatan (dalam km/jam) : ");
        double kecepatan = sc.nextDouble();
        double waktu = jarak/kecepatan;

        System.out.println("Hasil perhitungan waktu : " + waktu + "jam");

        sc.close();
    }
}
