import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;

            while (running) {
                System.out.println("\n=== PROGRAM GEOMETRI BENTUK ===");
                System.out.println("1. Tampilkan Contoh Otomatis (Demo All Shapes)");
                System.out.println("2. Buat Bujur Sangkar");
                System.out.println("3. Buat Lingkaran");
                System.out.println("4. Buat Silinder");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu (1-5): ");

                int pilihan = scanner.nextInt();
                scanner.nextLine(); 

                switch (pilihan) {
                    case 1 -> {
                        System.out.println("\n--- DEMO PEMBUATAN OBJEK OTOMATIS ---");
                        Bentuk b = new Bentuk("Merah");
                        b.printInfo();

                        BujurSangkar bs = new BujurSangkar(5, "Biru");
                        bs.printInfo();

                        Lingkaran l = new Lingkaran(10, "Kuning");
                        l.printInfo();

                        Silinder s = new Silinder(10, 3, "Hijau");
                        s.printInfo();
                    }

                    case 2 -> {
                        System.out.print("Masukkan Panjang Sisi: ");
                        double sisi = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Masukkan Warna: ");
                        String warnaBS = scanner.nextLine();

                        BujurSangkar userBS = new BujurSangkar(sisi, warnaBS);
                        System.out.println("\n>> Hasil Objek:");
                        userBS.printInfo();
                    }

                    case 3 -> {
                        System.out.print("Masukkan Radius (Jari-jari): ");
                        double radius = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Masukkan Warna: ");
                        String warnaL = scanner.nextLine();

                        Lingkaran userL = new Lingkaran(radius, warnaL);
                        System.out.println("\n>> Hasil Objek:");
                        userL.printInfo();
                    }

                    case 4 -> {
                        System.out.print("Masukkan Jari-jari Alas: ");
                        double rSilinder = scanner.nextDouble();
                        System.out.print("Masukkan Tinggi Silinder: ");
                        double tSilinder = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Masukkan Warna: ");
                        String warnaS = scanner.nextLine();

                        Silinder userS = new Silinder(tSilinder, rSilinder, warnaS);
                        System.out.println("\n>> Hasil Objek:");
                        userS.printInfo();
                    }

                    case 5 -> {
                        running = false;
                        System.out.println(">> Terima kasih telah menggunakan program!");
                    }

                    default -> System.out.println(">> Pilihan tidak valid. Silakan pilih 1-5.");
                }
            }
        }
    }
}