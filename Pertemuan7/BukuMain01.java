import java.util.Scanner;

public class BukuMain01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku01 data = new PencarianBuku01();
        int jumBuku = 5;

        System.out.println("----------------------------------------------");
        System.out.println("Masukkan data buku secara Urut dari kode buku terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-------------------");
            System.out.print("Kode Buku \t: ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t        : ");
            int stock = s.nextInt();

            Buku01 m = new Buku01(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        data.bubbleSort();
        System.out.println("--------------------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("Pencarian Data                   : ");
        System.out.println("Masukkan Judul Buku yang dicari  : ");
        System.out.print("Judul Buku                         : ");
        String cari = s1.nextLine();
        System.out.println("Menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        Buku01 dataBuku = data.FindBuku(cari);
        if (dataBuku != null){
            dataBuku.tampilDataBuku();
        } else {
            System.out.println("Buku dengan judul " + cari + " tidak ditemukan.");
        }

        // Percobaan 2
        System.out.println("======================");
        System.out.println("menggunakan binary search");
        posisi = data.FindBinarySearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
        
    }
}    