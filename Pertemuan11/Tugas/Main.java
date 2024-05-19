package Tugas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kapasitas antrian : ");
        int kapasitas = sc.nextInt();
        System.out.println("\n++++++++++++++++++++++++++++++++");
        System.out.println("PENGANGTRI VAKSIN EXTRAVAGANSA");
        System.out.println("\n++++++++++++++++++++++++++++++++");
        DblLinkedLists vaksinasi = new DblLinkedLists(kapasitas);
        int pilih;

        do {
            System.out.println("\n1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Antrian Vaksin Terdepan");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("Pilih menu (1/2/3/4) : ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("------------------------------");
                    System.out.println("Nomor Antrian : ");
                    int antrian = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nama Penerima Vaksin : ");
                    String nama = sc.nextLine();
                    break;
            
                case 2:
                    vaksinasi.removeAntrian();
                    break;
                
                case 3:
                    vaksinasi.print();
                
                default:
                break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3);
    }
}
