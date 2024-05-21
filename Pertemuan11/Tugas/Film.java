package Tugas;
import java.util.Scanner;
public class Film {
    static class Node {
        int id;
        double rating;
        String judul;
        Node prev, next;
    
        Node(Node prev, int id, String judul, double rating, Node next) {
            this.prev = prev;
            this.id = id; 
            this.judul = judul;
            this.rating = rating;
            this.next = next;
        }
    }

    Node head;
    int size;

    public Film() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int id, String judul, double rating) {
        Node newNode = new Node(null, id, judul, rating, head);
        if (head != null) {
            head.prev = head;
        }
        head = newNode;
        size++;

    }

    public void addLast(int id, String judul, double rating) {
        if (isEmpty()) {
            addFirst(id, judul, rating);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(current, id, judul, rating, null);
        size++;
    }

    public void add(int id, String judul, double rating, int index){
        if (index < 0 || index > size) {
            System.out.println("Nilai indeks diluar batas");
            return;
        } 
        if (index == 0) {
            addFirst(id, judul, rating);
        } else if (index == size) {
            addLast(id, judul, rating);
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node newNode = new Node(current, id, judul, rating, current.next);
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            size++;
        }
        System.out.println("Film masuk di urutan ke-" + (index + 1));
    }

    public void removeFirst() throws IndexOutOfBoundsException {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Daftar Film masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
            System.out.println("Data Film berhasil dihapus");
        }
    }

    public void removeLast() throws IndexOutOfBoundsException {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Daftar Film masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            System.out.println("Data Film berhasil dihapus");
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
        System.out.println("Data Film berhasil dihapus");
    }

    public void remove(int id) {
        Node current = head;
        while (current != null && current.id != id) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Film dengan ID " + id + " tidak ditemukan!");
            return;
        }
        if (current == head) {
            removeFirst();
            return;
        }
        if (current.next == null) {
            removeLast();;
            return;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
        System.out.println("Data Film berhasil dihapus");
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("ID Film: " + tmp.id);
                System.out.println("Judul Film: " + tmp.judul);
                System.out.println("Rating Film: " + tmp.rating);
                System.out.println("-----------------------------------");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Daftar Film masih kosong");
        }
    }

    public Node get(int id) throws IndexOutOfBoundsException {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Daftar Film masih kosong");
        }
        Node tmp = head;
        while (tmp != null) {
            if (tmp.id == id) {
                return tmp;
            }
            tmp = tmp.next;
        }
        throw new IndexOutOfBoundsException("Film dengan ID " + id + " tidak ditemukan");
    }

    public void sortingRating() {
        if (size <= 1) {
            return;
        }
        Node current = head;
        Node next;
        for (int i = 0; i < size - 1; i++) {
            next = current.next;
            while (next != null) {
                if (current.rating < next.rating) {
                    int tempId = current.id;
                    String tempJudul = current.judul;
                    double tempRating = current.rating;
                    current.id = next.id;
                    current.judul = next.judul;
                    current.rating = next.rating;
                    next.id = tempId;
                    next.judul = tempJudul;
                    next.rating = tempRating;
                }
                current = current.next;
                next = next.next;
            }
            current = head;
        }

    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih, id, index;
        String judul;
        double rating;
        Film film = new Film();
        do {
            System.out.println("\n==================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("==================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urutan Rating Film Descending");
            System.out.println("10. Keluar");
            System.out.println("==================================");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Tambah Data Awal");
                    System.out.print("ID Film       : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film    : ");
                    judul = sc.nextLine();
                    System.out.print("Rating Film   : ");
                    rating = sc.nextDouble();
                    film.addFirst(id, judul, rating);
                    break;
                
                case 2:
                    System.out.println("Tambah Data Akhir");
                    System.out.print("ID Film       : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film    : ");
                    judul = sc.nextLine();
                    System.out.print("Rating Film   : ");
                    rating = sc.nextDouble();
                    film.addLast(id, judul, rating);
                    break;

                case 3:
                    System.out.println("Tambah Data Index tertentu");
                    System.out.print("ID Film         : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film      : ");
                    judul = sc.nextLine();
                    System.out.print("Rating Film     : ");
                    rating = sc.nextDouble();
                    System.out.print("Index           : ");
                    index = sc.nextInt();
                    film.add(id, judul, rating, index);
                    break;
                
                case 4:
                    film.removeFirst();
                    break;

                case 5:
                    film.removeLast();
                    break;

                case 6:
                    System.out.println("ID film yang ingin dihapus: ");
                    id = sc.nextInt();
                    film.remove(id);
                    break;

                case 7:
                    film.print();
                    break;
                
                case 8:
                    System.out.print("ID Film yang ingin dicari : ");
                    id = sc.nextInt();
                    Node filmGet = film.get(id);
                    System.out.println("Film ditemukan:");
                    System.out.println("ID Film     : " + filmGet.id);
                    System.out.println("Judul Film  : " + filmGet.judul);
                    System.out.println("Rating Film : " + filmGet.rating);
                    break;
                
                case 9:
                    film.sortingRating();
                    System.out.println("Urutan Film Dari Rating Tertinggi");
                    film.print();
                    break;
                
                case 10:
                    break;

                default:
                    break;
            }
        } while (pilih != 10);

    }
}