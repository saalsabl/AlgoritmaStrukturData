import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        DoubleLL klasemen = new DoubleLL();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("========== ENGLAND PREMIER LEAGUE ==========");
            System.out.println("Menu Klasemen EPL:");
            System.out.println("1. Input Data Tim");
            System.out.println("2. Tampilkan Klasemen");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda (1-3): ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    String[] klubList = {
                            "Man City", "Arsenal", "Liverpool", "AstonVila", "Tottenham",
                            "Chelsea", "Newcastle", "Man Utd", "West Ham", "Crystal Palace",
                            "Brighton", "Bournemouth", "Fulham", "Wolves", "Everton",
                            "Brentford", "Nottingham", "Luton", "Burnley", "Sheff Utd"
                    };

                    for (String klub : klubList) {
                        System.out.println("\nInput Data untuk " + klub + ": ");
                        System.out.print("Menang: ");
                        int menang = sc.nextInt();
                        System.out.print("Seri: ");
                        int seri = sc.nextInt();
                        System.out.print("Kalah: ");
                        int kalah = sc.nextInt();
                        System.out.print("Gol Masuk: ");
                        int golMasuk = sc.nextInt();
                        System.out.print("Gol Kebobolan: ");
                        int golKebobolan = sc.nextInt();

                        klasemen.insertAtHead(klub, 38, menang, seri, kalah, golMasuk, golKebobolan);
                    }
                    break;
                case 2:
                    klasemen.printList();
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 3);

        sc.close();
    }
}