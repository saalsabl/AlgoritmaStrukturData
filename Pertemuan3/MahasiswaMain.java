import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa[] mhsArray = new Mahasiswa[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            mhsArray[i] = new Mahasiswa();
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama: ");
            mhsArray[i].nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            mhsArray[i].NIM = sc.nextInt();
            System.out.print("Masukkan Jenis Kelamin: ");
            mhsArray[i].gender = sc.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            mhsArray[i].IPK = sc.nextDouble();
            sc.nextLine();
        }
        
        for(int i = 0; i < 3; i++){
                System.out.println("Data Mahasiswa ke-" + (i+1));
                System.out.println("Nama: " + mhsArray[i].nama + "\nNIM: " + mhsArray[i].NIM + "\nJenis Kelamin: " + mhsArray[i].gender + "\nNilai IPK: " + mhsArray[i].IPK);
            }    
    }
}
