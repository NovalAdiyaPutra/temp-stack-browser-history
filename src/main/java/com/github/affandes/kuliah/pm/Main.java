import java.util.Scanner;
import java.util.Stack;

public class RiwayatBrowser {
    private Stack<String> riwayat;

    public RiwayatBrowser() {
        riwayat = new Stack<>();
    }

    public void browse(String website) {
        riwayat.push(website);
        System.out.println("Menjelajah ke: " + website);
    }

    public void back() {
        if (riwayat.isEmpty()) {
            System.out.println("Tidak ada riwayat untuk kembali!");
        } else {
            System.out.println("Kembali dari: " + riwayat.pop());
        }
    }

    public void view() {
        if (riwayat.isEmpty()) {
            System.out.println("Tidak ada riwayat penjelajahan.");
        } else {
            System.out.println("Riwayat Penjelajahan:");
            for (int i = riwayat.size() - 1; i >= 0; i--) {
                System.out.println(riwayat.get(i));
            }
        }
    }

    public static void main(String[] args) {
        RiwayatBrowser riwayatBrowser = new RiwayatBrowser();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n--- Browser Menu ---");
            System.out.println("1. Browse website");
            System.out.println("2. View history");
            System.out.println("3. Back");
            System.out.println("4. Exit");
            System.out.print("Pilih Opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan URL website: ");
                    String website = scanner.nextLine();
                    riwayatBrowser.browse(website);
                    break;
                case 2:
                    riwayatBrowser.view();
                    break;
                case 3:
                    riwayatBrowser.back();
                    break;
                case 4:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
