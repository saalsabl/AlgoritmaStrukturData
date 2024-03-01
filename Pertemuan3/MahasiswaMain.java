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
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.tampilData(mhsArray);
        System.out.print("\n");

        double rataRata = mhs.hitungrataRata(mhsArray);
        System.out.println("-------------------------------------");
        System.out.printf("%-30s : %-4.2f","Rata-rata IPK mahasiswa adalah", rataRata);
        System.out.print("\n");

        double ipkBesar = mhs.cariIPKTerbesar(mhsArray);
        System.out.println("-------------------------------------");
        System.out.println("IPK mahasiswa Terbesar adalah : "+ ipkBesar);
        System.out.println("-------------------------------------");

        sc.close();
 
    }
}
