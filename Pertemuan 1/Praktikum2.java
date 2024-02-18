import java.util.Scanner;
public class Praktikum2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input NIM : ");
        Long nim = sc.nextLong();
        System.out.println("======================");
        long n = nim%100;
      
        if (n<10){
            n+=10;
        }
        for (int i =1; i<= n; i++){
            if (i==6 || i==10){
                continue;
            }
            if (i%2==0){
                System.out.print(i + " ");
            }else {
                System.out.print("* ");
            }
        }

    }
}
