import java.util.Scanner;

public class Utama01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       // Gudang01 gudang = new Gudang01(7);

       System.out.println("Masukkan kapasitas tumpukan barang : ");
       int jumlah = s.nextInt();
       Gudang01 gudang = new Gudang01(jumlah);

        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat tumpukan teratas");
            System.out.println("5. Keluar");
            System.out.print("\nPilih : ");
            int pilih = s.nextInt();
            s.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan kode barang : ");
                    int kode = s.nextInt();
                    s.nextLine();
                    System.out.print("Masukkan nama barang : ");
                    String nama = s.nextLine();
                    System.out.print("Masukkan nama kategori : ");
                    String kategori = s.nextLine();
                    Barang01 barangBaru = new Barang01(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.teratas();
                    break;
                    
                default:
                System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
    }
}