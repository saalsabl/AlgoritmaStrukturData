import java.util.Scanner;
public class Praktikum2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input NIM : ");
        String nim = sc.nextLine();
        System.out.println("======================");
        long n = nim%100;
        System.out.println("n "+n);

        if (n<10){
            n+=10;
        }
        String hari[] = {"senin", "selasa","rabu", "kamis", "jumat", "sabtu", "minggu" };
        for(int i=0; i<n; i++){
            System.out.print(hari[i%7]+",");
        }

    }
}
