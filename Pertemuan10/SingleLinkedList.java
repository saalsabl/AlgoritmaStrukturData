public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() {
        // return head != null;
        return head == null;
    }

    void print() {
        // if (isEmpty()) {
            if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List : \t");
            // while (tmp == null) {
                while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
            // ndInput.next = head;
            // head = ndInput;
        } else {
            // head = ndInput;
            // tail = ndInput;
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            // tail.next = ndInput;
            head = ndInput;
            tail = ndInput;
        } else {
            // head = ndInput;
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                // if (ndInput.next != null) {
                    if (ndInput.next == null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        // } while (temp == null);
        } while (temp != null);
    }

    void insertAt(int index, int input) {
        // Node ndInput = new Node(input, head);
        // if (index > 0) {
        if (index < 0) {
            System.out.println("Perbaiki logikanya!" + "kalau indeksnya -1 bagaimana???");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            // for(int i = 0; i < index; i++) {
            for(int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next==null) {
                tail = temp.next;
            }
        }
    }
}

