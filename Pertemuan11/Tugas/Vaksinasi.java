package Tugas;
import java.util.Scanner;

public class Vaksinasi {
    public static class Node {
        int antrian;
        String nama;
        Node prev, next;
    
        Node(Node prev, int antrian, String nama, Node next) {
            this.prev = prev;
            this.antrian = antrian; 
            this.nama = nama;
            this.next = next;
        }
    }

    Node head;
    int size, kapasitas;

    public Vaksinasi(int kapasitas) {
        this.size = 0;
        this.kapasitas = kapasitas;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addAntrian(int antrian, String nama) {
        if (size >= kapasitas) {
            System.out.println("Antrian sudah penuh. Tidak dapat menambahkan antrian baru!");
        }
        else if (isEmpty()) {
            head = new Node(null, antrian, nama, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, antrian, nama, null);
            current.next = newNode;
        }
        size++;
    }

    public void removeAntrian() throws IndexOutOfBoundsException {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Antrian masih kosong, tidak dapat dihapus!");
        }
        System.out.println(head.nama + " telah divaksinasi.");
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        size--;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("---------------------------------------");
            System.out.println("Daftar Antrian Vaksinasi");
            System.out.println("---------------------------------------");
            System.out.printf("| %-5s | %-10s |%n", "No.", "Nama");
            while (tmp != null) {
                System.out.printf("| %-5d | %-10s |%n", tmp.antrian, tmp.nama);
                tmp = tmp.next;
            }
            System.out.println("---------------------------------------");
            System.out.println("Sisa antrian: " + size);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int kapasitas = sc.nextInt();
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++");
        System.out.println("     PENGANTRI VAKSIN EXTRAVAGANZA     ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        Vaksinasi v = new Vaksinasi(kapasitas);
        int pilih;

        do {
            System.out.println("\n1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Antrian Vaksin Terdepan");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            System.out.print("Pilih menu (1/2/3/4): ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("---------------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("---------------------------------------");
                    System.out.print("Nomor Antrian         : ");
                    int antrian = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Penerima Vaksin  : ");
                    String nama = sc.nextLine();
                    v.addAntrian(antrian, nama);
                    break;
    
                case 2:
                    v.removeAntrian();
                    break;
    
                case 3:
                    v.print();
                    break;
    
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3);
    }
}