import java.util.Scanner;
public class Praktikum4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] namaToko = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        int[][] stokBunga = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
        int[] hargaBunga = {75000, 50000, 60000, 10000};

        stokBunga[3][0] -= 1;
        stokBunga[3][1] -= 2;
        stokBunga[3][3] -= 5;

        int[] pendapatanSetiapCabang = hitungPendapatanSetiapCabang(stokBunga, hargaBunga);
        int[] stokBungaCabang4 = hitungStokSetiapJenisBunga(stokBunga[3]);

        System.out.println("Pendapatan setiap cabang");
        for (int i = 0; i < namaToko.length; i++){
            System.out.println(namaToko[i] + ": " + pendapatanSetiapCabang[i]);
        }
        System.out.println("\nStok setiap jenis bugna di RoyalGarden4 : ");

        System.out.println("Algonema : " + stokBungaCabang4 [0]);
        System.out.println("Keladi : " + stokBungaCabang4[1]);
        System.out.println("Alocasia : " + stokBungaCabang4[2]);
        System.out.println("Mawar : " + stokBungaCabang4[3]);
        }
        public static int[] hitungPendapatanSetiapCabang(int[][] stokBunga, int[]hargaBunga){
            int[] pendapatanSetiapCabang = new int[stokBunga.length];
            for (int i = 0; i < stokBunga.length; i++){
                int pendapatanCabang = 0;
                for (int j = 0; j < stokBunga[i].length; j++){
                    pendapatanCabang += stokBunga[i][j] * hargaBunga[j];
                }
                pendapatanSetiapCabang[i] = pendapatanCabang;
            }
            return pendapatanSetiapCabang;
    }
    public static int[] hitungStokSetiapJenisBunga(int[]stokBunga){
        int[] stokSetiapjenisBunga = new int[stokBunga.length];
        for (int i = 0; i < stokBunga.length; i++) {
            stokSetiapjenisBunga[i] = stokBunga[i];
        }
        return stokSetiapjenisBunga;
    }
}

