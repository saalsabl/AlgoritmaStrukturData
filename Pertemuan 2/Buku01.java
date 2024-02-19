import java.util.Scanner;
public class Buku01{

    String judul, pengarang;
    int halaman, stok, harga, bayar, total, diskon;

    void tampilInformasi(){
        System.out.println("Judul           : " + judul);
        System.out.println("Pengarang       : " + pengarang);
        System.out.println("Jumlah halaman  : " + halaman);
        System.out.println("Sisa stok       : " + stok);
        System.out.println("Harga 1 buku    : Rp " + harga);
        System.out.println("Harga sebelum diskon : Rp " + total);
        System.out.println("Harga setelah diskon : Rp " + bayar);
    }

    void terjual(int jml){
        if (stok > 0){
        stok -= jml;
        }
    }

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }

    void hitungHargaTotal(int jml){
        total = harga * jml;
    }

    void hitungDiskon(){
        if (total > 150000){
            diskon += total * 0.12;
        } else if (total > 75000 || total <= 150000){
            diskon += total * 0.5;
        }
    }

    void hitungHarga (){
        bayar = total - diskon;
       
    }
    public Buku01() {

    }

    public Buku01(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}
