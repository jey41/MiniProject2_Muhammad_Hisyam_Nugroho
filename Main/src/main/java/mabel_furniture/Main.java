package mabel_furniture;

import services.FurnitureService;
import java.util.Scanner;

public class Main {
    private static final FurnitureService furnitureService = new FurnitureService(); // Menggunakan final keyword
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Sistem Manajemen Mabel Furniture ---");
            System.out.println("1. Tambah Furniture");
            System.out.println("2. Lihat Semua Furniture");
            System.out.println("3. Update Furniture");
            System.out.println("4. Hapus Furniture");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    furnitureService.addFurniture();
                    break;
                case 2:
                    furnitureService.viewFurniture();
                    break;
                case 3:
                    furnitureService.updateFurniture();
                    break;
                case 4:
                    furnitureService.deleteFurniture();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 5);
        
        scanner.close();
    }
}
