package Tugas;

public class Mahasiswa {
    int nim;
    String nama;
    Mahasiswa next;

    public Mahasiswa(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        next = null;
    }
}
