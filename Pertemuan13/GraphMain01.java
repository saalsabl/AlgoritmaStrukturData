import java.util.Scanner;
public class GraphMain01 {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Add Edge");
        System.out.println("2. Remove Edge");
        System.out.println("3. Degree");
        System.out.println("4. Print Graph");
        System.out.println("5. Cek Edge");
        System.out.println("6. Ubah Jarak");
        System.out.println("7. Hitung Edge");
        System.out.println("8. Keluar");
        System.out.println("-------------------------------");
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah vertex : ");
        int v = sc.nextInt();
        Graph01 gedung = new Graph01(v);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan gedung asal : ");
                    int asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan : ");
                    int tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak gedung : ");
                    int jarak = sc.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);;
                    break;
                
                case 2:
                    System.out.print("Masukkan asal gedung yang akan dihapus : ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan yang akan dihapus : ");
                    tujuan = sc.nextInt();
                    gedung.removeEdge(asal, tujuan);
                    break;

                case 3:
                    System.out.print("Masukkan vertex untuk mengecek degree :");
                    asal = sc.nextInt();
                    gedung.degree(asal);
                    break;

                case 4:
                    gedung.printGraph();
                    break;

                case 5:
                    System.out.print("Masukkan asal gedung :");
                    asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan : ");
                    tujuan = sc.nextInt();
                    gedung.cekEdge(asal, tujuan);
                    break;

                case 6:
                    System.out.print("Masukkan asal gedung :");
                    asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan : ");
                    tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak baru gedung :");
                    int jarakBaru = sc.nextInt();
                    gedung.updateJarak(asal, tujuan, jarakBaru);
                    break;

                case 7:
                    gedung.hitungEdge();
                    break;

                case 8:
                    System.out.println("Keluar dari program.");
                    sc.close();
                    return;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8);
    }
}

        // gedung.addEdge(0, 1, 50);
        // gedung.addEdge(0, 2, 100);
        // gedung.addEdge(1, 3, 70);
        // gedung.addEdge(2, 3, 40);
        // gedung.addEdge(3, 4, 60);
        // gedung.addEdge(4, 5, 80);
        // gedung.degree(0);
        // gedung.printGraph();

        // gedung.removeEdge(1, 3);
        // gedung.printGraph();

        //Percobaan 2
