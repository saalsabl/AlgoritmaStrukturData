import java. util.Scanner;
public class Praktikum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int ntugas, nuts, nuas;
        double nilaiAkhir;
        String nilaiHuruf;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas : ");
        ntugas = sc.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        nuts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        nuas = sc.nextInt();
        System.out.println("======================");
        System.out.println("======================");
        nilaiAkhir = ((0.2 * ntugas)+(0.35 * nuts)+(0.45 * nuas));
        System.out.println("Nilai Akhir : "+nilaiAkhir);
        if (nilaiAkhir>80 && nilaiAkhir<=100){
            nilaiHuruf = "A";
        }else if (nilaiAkhir>73 && nilaiAkhir<=80){
            nilaiHuruf = "B+";
        }else if (nilaiAkhir>65 && nilaiAkhir<=73){
            nilaiHuruf = "B";
        }else if (nilaiAkhir>60 && nilaiAkhir<=65){
            nilaiHuruf = "C+";
        }else if (nilaiAkhir>50 && nilaiAkhir<=60){
            nilaiHuruf = "C+";
        }else if (nilaiAkhir>39 && nilaiAkhir<=50){
            nilaiHuruf = "D";
        }else{
            nilaiHuruf = "E";
        }
        System.out.println("Nilai Huruf = "+nilaiHuruf);
        System.out.println("======================");
        if(nilaiHuruf=="A"|| nilaiHuruf=="B+"|| nilaiHuruf=="B"|| nilaiHuruf=="C+"|| nilaiHuruf=="C"){
            System.out.println("LULUS");
        }else{
            System.out.println("TIDAK LULUS");
        }

    }
}
