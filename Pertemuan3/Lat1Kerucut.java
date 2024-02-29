import java.util.Scanner;
public class Lat1Kerucut {
    public static class kerucut{
        public double jarijari;
        public double sisimiring;
        public double tinggi;

        public kerucut(){

        }
        double hitungluasPermukaan(){
            return 3.14*jarijari*sisimiring*(jarijari*sisimiring);
        }
        void hitungTinggi(){
            tinggi = Math.sqrt((sisimiring*sisimiring) - (jarijari*jarijari));
        }
        double hitungVolume(){
            hitungTinggi();
            return 3.14*jarijari*jarijari*tinggi/3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah kerucut: ");
        int k = sc.nextInt();
        kerucut[] cone = new kerucut[k];
    
        for (int j = 0; j < k; j++){
            cone[j] = new kerucut();
            System.out.println("Kerucut ke-" + j);
            System.out.print("Masukkan jari-jari: ");
            cone[j].jarijari = input.nextDouble();
            System.out.print("Masukkan sisi miring: ");
            cone[j].sisimiring = input.nextDouble();
        }
    
        for(int i = 0; i < k; i++){
            System.out.println("Kerucut ke-" + i + " , Luas Permukaan : " + cone[i].hitungluasPermukaan() + ", Volume : " + cone[i].hitungVolume());
        }
    }
    
}
