package Tugas;

public class DblLinkedLists {
    Node head;
    int size, kapasitas;

    public DblLinkedLists(int kapasitas){
        this.size = 0;
        this.kapasitas = kapasitas;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void addAntrian(int antrian, String nama) {
        if (size >= kapasitas) {
            System.out.println("Antrian penuh, tidak dapat menambah antrian baru!");
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
        System.out.println(head.nama + "telah divaksinasi.");
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        size--;
    } 

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("----------------------------------------");
            System.out.println("Daftar Antrian Vaksinasi");
            System.out.println("----------------------------------------");
            System.out.printf("| %-5s | %-10s |%n", "No.", "Nama");
            while (tmp != null) {
                System.out.printf("| %-5s | %-10s |%n", tmp.antrian, tmp.nama);
                tmp = tmp.next;
            }
            System.out.println("----------------------------------------");
            System.out.println("Sisa antrian : " + size);
        } else {
            System.out.println("Antrian masih kosong!");
        }
    }
}

