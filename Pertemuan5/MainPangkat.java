import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen =sc.nextInt();

        Pangkat[]png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++){
            int nilai = 0, pangkat = 0;
            System.out.print("Masukkan nilai yang akan dipangkatkan : ");
            nilai = sc.nextInt();
            System.out.print("Masukkan nilai pangkat : ");
            pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }
        System.out.println("PILIHAN MENU");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide & Conquer");
        System.out.println("Pilih menu 1/2 : ");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("HASIL PANGKAT BRUTE FORCE");
                for(int i = 0; i < elemen; i++){
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println(" HASIL PANGKAT DIVIDE & CONQUER");
                for (int i = 0; i < elemen; i++){
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;

            default:
                System.out.println("Menu tidak dapat ditemukan.");
        }

        System.out.println("=======================================");
        System.out.println("Hasil Pangkat dengan Brute Force ");
        for (int i = 0; i < elemen; i++){
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("=======================================");
        System.out.println("Hasil Pangkat dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++){
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
        System.out.println("=======================================");
    }
    
}
