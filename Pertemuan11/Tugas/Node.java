package Tugas;

public class Node {
    int antrian;
    String nama;
    Node next, prev;

    public Node(Node prev, int antrian2, String nama, Node next) { 
        this.prev = prev;
        this.antrian = antrian;
        this.nama = nama;
        this.next = next;
    }
}
