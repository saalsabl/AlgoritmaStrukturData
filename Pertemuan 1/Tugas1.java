import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int namaKota = -1;
        char[] Kode = new char[10];
        Kode[0] = 'A'; 
        Kode[1] = 'B';
        Kode[2] = 'D';
        Kode[3] = 'E';
        Kode[4] = 'F';
        Kode[5] = 'G';
        Kode[6] = 'H';
        Kode[7] = 'L';
        Kode[8] = 'N';
        Kode[9] = 'T';
        
        char[][] Kota = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'},
        };

        System.out.print("Masukkan Kode plat nomor : ");
        String scPlat = sc.nextLine();

        for (int i = 0; i < Kode.length; i++) {
            if (Kode[i] == scPlat.charAt(0)) {
                namaKota = i;
                break;
            }
        }
        if (namaKota == -1) {
            System.out.println("Kode plat tidak ditemukan!");
        } else {
            System.out.println("Kota: " + new String(Kota[namaKota]));
        }
    }
}