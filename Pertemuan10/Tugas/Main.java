package Tugas;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.print();
        list.addFirst(123, "Wildan");
        list.print();
        list.addLast(124, "Intan");
        list.print();
        list.insertAfter(124, 127, "Ardi");
        list.print();
        list.insertAt(3, 128, "Aden");
        list.print();
    }
}