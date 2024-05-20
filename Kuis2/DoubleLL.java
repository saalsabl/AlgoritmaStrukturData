public class DoubleLL {
    private Node head;
        private Node tail;

        public DoubleLL() {
            this.head = null;
            this.tail = null;
        }

        public void insertAtHead(String klub, int Team, int menang, int seri, int kalah, int golMasuk, int golKebobolan) {
            Node newNode = new Node(klub, Team, menang, seri, kalah, golMasuk, golKebobolan);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }

            sortList();
        }

        public void sortList() {
            if (head == null) return;

            boolean swapped;
            do {
                swapped = false;
                Node current = head;
                while (current != null && current.next != null) {
                    if (current.poin < current.next.poin) {
                        swap(current, current.next);
                        swapped = true;
                    }
                    current = current.next;
                }
            } while (swapped);
        }

        private void swap(Node a, Node b) {
            String tempKlub = a.klub;
            int tempTeam = a.Team;
            int tempMenang = a.menang;
            int tempSeri = a.seri;
            int tempKalah = a.kalah;
            int tempPoin = a.poin;
            int tempGolMasuk = a.golMasuk;
            int tempGolKebobolan = a.golKebobolan;
            int tempSelisihGol = a.selisihGol;

            a.klub = b.klub;
            a.Team = b.Team;
            a.menang = b.menang;
            a.seri = b.seri;
            a.kalah = b.kalah;
            a.poin = b.poin;
            a.golMasuk = b.golMasuk;
            a.golKebobolan = b.golKebobolan;
            a.selisihGol = b.selisihGol;

            b.klub = tempKlub;
            b.Team = tempTeam;
            b.menang = tempMenang;
            b.seri = tempSeri;
            b.kalah = tempKalah;
            b.poin = tempPoin;
            b.golMasuk = tempGolMasuk;
            b.golKebobolan = tempGolKebobolan;
            b.selisihGol = tempSelisihGol;
        }

        public void printList() {
            if (head == null) {
                System.out.println("Klasemen EPL 2024 kosong!");
                return;
            }

            Node current = head;
            int rank = 1;
            System.out.println("========================================================================================================================");
            System.out.println("|   Posisi  | Klub        | T  | M  | K  | S  | Poin | Gol Masuk | Gol Kebobolan | Selisih Gol |");
            System.out.println("========================================================================================================================");

            while (current != null) {
                String rankStr = String.format("%3d", rank);
                String TeamStr = String.format("%3d", current.Team);
                String menangStr = String.format("%3d", current.menang);
                String seriStr = String.format("%3d", current.seri);
                String kalahStr = String.format("%3d", current.kalah);
                String poinStr = String.format("%3d", current.poin);
                String golMasukStr = String.format("%4d", current.golMasuk);
                String golKebobolanStr = String.format("%4d", current.golKebobolan);
                String selisihGolStr = String.format("%4d", current.selisihGol);

                System.out.printf("| %7s | %-10s | %3s |%3s | %3s | %3s | %4s | %8s | %14s | %11s |\n",
                        rankStr, current.klub, TeamStr, menangStr, seriStr, kalahStr, poinStr, golMasukStr, golKebobolanStr, selisihGolStr);

                rank++;
                current = current.next;
            }
            System.out.println("========================================================================================================================");
        }
    }