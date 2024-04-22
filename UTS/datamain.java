import java.util.ArrayList;
import java.util.Scanner;

public class datamain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        SearchData data = new SearchData();
        int jumData = 17;

        System.out.println("Masukkan data secara urut dari yang terkecil : ");
        for (int i = 0; i < jumData; i++){
            System.out.println("Masukkan Data : ");
            int datauts = scanner.nextInt();
            scanner.nextLine();

            datauts n = new datauts(null);
            data.tambah(n);

            System.out.println("Masukkan data yang dicari : ");
            String cari = s.nextLine();
            ArrayList<Integer> positions = data.findData(cari);
            data.TampilData(cari, positions);

        }
    }
}
