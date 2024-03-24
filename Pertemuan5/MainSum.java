import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int perusahaan = sc.nextInt();

        Sum sm[] = new Sum[perusahaan];
        for (int i = 0; i < perusahaan; i++){
            System.out.println("Masukkan jumlah bulan perusahaan ke- " + (i+1) + ": ");
            int elemen = sc.nextInt();
            sm[i] = new Sum(elemen);
            for(int j = 0; j < sm[i].elemen; j++){
                System.out.print("Masukkan untung bulan ke-" + (i+1)+ " = ");
                sm[i].keuntungan[i] = sc.nextDouble();
            }
        }
        System.out.println("===============================================");
        System.out.println("Algoritma Brute Force");
        for(int i = 0; i < sm.length; i++){
            System.out.print("Total keuntungan perusahaan ke-"+(i+1));
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalBF(sm[i].keuntungan));

        }
        System.out.println("===============================================");
        System.out.println("Algoritma Divide and Conquer");
        for(int i = 0; i < sm.length; i++){
            System.out.println("Total keuntungan perusahaan ke-"+(i+1));
            System.out.println("Total keuntungan perusahaan selama "+sm[i].elemen+ " bulan adalah = "+sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1));
        }
    }
}
