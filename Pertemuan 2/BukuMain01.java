public class BukuMain01 {
    public static void main(String[] args) {
        // Buku01 bk1 = new Buku01();
        // bk1.judul = "Today Ends Tomorrow Comes";
        // bk1.pengarang = "Denada Pratiwi";
        // bk1.halaman = 198;
        // bk1.stok = 13;
        // bk1.harga = 71000;
        // bk1.tampilInformasi();

        Buku01 bk1 = new Buku01("Today Ends Tomorrow Comes", "Denada Pratiwi", 198, 13, 71000);
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.hitungHargaTotal(5);
        bk1.hitungDiskon();
        bk1.hitungHarga();
        bk1.tampilInformasi();

        Buku01 bk2 = new Buku01("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.hitungHargaTotal(11);
        bk2.hitungDiskon();
        bk2.hitungHarga();
        bk2.tampilInformasi();

        Buku01 bukuAaisyah = new Buku01("Koala Kumal", "Raditya Dika", 250, 15, 74400);
        bukuAaisyah.terjual(10);
        bukuAaisyah.hitungHargaTotal(5);
        bukuAaisyah.hitungDiskon();
        bukuAaisyah.hitungHarga();
        bukuAaisyah.tampilInformasi();
    }
}