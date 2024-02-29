import java.util.Scanner;
public class Lat1Bola {
    public static class Bola{
        public double jarijari;

        double hitungluasPermukaan(){
            return jarijari*jarijari*4*3.14;
        }
        double hitungVolume(){
            return 4/3*3.14*jarijari*jarijari;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah bola : ");
        int i = sc.nextInt();
        Bola[] ball = new Bola[i];

        for(int k = 0; k < i; k++){
            ball[k] = new Bola();
            System.out.println("Bola ke-" + i);
            System.out.print("Masukkan jari-jari: ");
            ball[k].jarijari = input.nextDouble();
            
        }
        for(int l = 0; l < i; l++){
            System.out.println("Bola ke-" + l + " , Luas Permukaan : " + ball[l].hitungluasPermukaan() + ", Volume : " + ball[l].hitungVolume());
        }
    }
}
