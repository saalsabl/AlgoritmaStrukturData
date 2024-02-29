import java.util.Scanner;
public class Lat1Limas {
    public static class limas{
        public double panjangsisiAlas;
        public double tinggi;
        public double tinggiSiring;
        public double luasSegitiga;

        void hitungtinggiSiring(){
            tinggiSiring = Math.sqrt((tinggi*tinggi)+(1/2*panjangsisiAlas*1/2*panjangsisiAlas));
        }
        double hitungluasPermukaan(){
            hitungtinggiSiring();
            return (4*(1/2*panjangsisiAlas*tinggiSiring))+(panjangsisiAlas*panjangsisiAlas);
        }
        double hitungVolume(){
            return (panjangsisiAlas*panjangsisiAlas)*tinggi/3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah limas: ");
        int i = sc.nextInt();
        limas[] pyramid = new limas[i];

        for (int k = 0; k < i; k++){
            pyramid[k] = new limas();
            System.out.println("Kerucut ke-" + k);
            System.out.print("Masukkan panjang sisi alas: ");
            pyramid[k].panjangsisiAlas = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            pyramid[k].tinggi = input.nextDouble();
        }

        for (int l = 0; l < i; l++){
            System.out.println("Limas ke-" + l + " , Luas Permukaan: " + pyramid[l].hitungluasPermukaan() + " , Volume: " + pyramid[l].hitungVolume());
        }
    }
}
