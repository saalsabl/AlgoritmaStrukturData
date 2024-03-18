import java.util.Scanner;
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        Faktorial[] fk = new Faktorial[10];
        for (int i = 0; i < iJml; i++){
            fk[i] = new Faktorial();
            System.out.println("masukkan nilai data ke-" + (i+1)+" : ");
            // int iNilai = sc.nextInt();
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("HASIL - BRUTE FORCE");
        for(int i=0; i < iJml; i++){
            System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah " + fk[i].FaktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++){
            System.out.println("hasil penghitungan faktorial menggunakan Divide and Conquer adalah " + fk[i].FaktorialDC(fk[i].nilai));
        }
    }
    
}
