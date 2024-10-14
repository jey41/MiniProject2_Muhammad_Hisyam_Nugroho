/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import models.Chair;
import models.Furniture;
import models.Table;
import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureService implements CrudOperations {
    private ArrayList<Furniture> furnitureList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addFurniture() {
        System.out.print("Pilih jenis furniture (1: Chair, 2: Table): ");
        int typeChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Masukkan nama furniture: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan harga furniture: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        if (typeChoice == 1) {
            System.out.print("Masukkan material kursi: ");
            String material = scanner.nextLine();
            Chair newChair = new Chair(name, price, material);
            furnitureList.add(newChair);
        } else if (typeChoice == 2) {
            System.out.print("Masukkan jumlah kaki meja: ");
            int legs = scanner.nextInt();
            Table newTable = new Table(name, price, legs);
            furnitureList.add(newTable);
        } else {
            System.out.println("Jenis furniture tidak valid!");
        }

        System.out.println("Furniture berhasil ditambahkan!");
    }

    @Override
    public void viewFurniture() {
        if (furnitureList.isEmpty()) {
            System.out.println("Tidak ada furniture dalam daftar.");
        } else {
            System.out.println("\nDaftar Furniture:");
            for (Furniture furniture : furnitureList) {
                furniture.displayDetails();
                System.out.println("-------------------");
            }
        }
    }

    @Override
    public void updateFurniture() {
        System.out.print("Masukkan nama furniture yang ingin di-update: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (Furniture furniture : furnitureList) {
            if (furniture.getName().equalsIgnoreCase(name)) {
                System.out.print("Masukkan nama baru: ");
                String newName = scanner.nextLine();
                System.out.print("Masukkan harga baru: ");
                double newPrice = scanner.nextDouble();
                scanner.nextLine(); // Consume newline

                furniture.setName(newName);
                furniture.setPrice(newPrice);
                System.out.println("Furniture berhasil di-update!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Furniture tidak ditemukan.");
        }
    }

    @Override
    public void deleteFurniture() {
        System.out.print("Masukkan nama furniture yang ingin dihapus: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (Furniture furniture : furnitureList) {
            if (furniture.getName().equalsIgnoreCase(name)) {
                furnitureList.remove(furniture);
                System.out.println("Furniture berhasil dihapus!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Furniture tidak ditemukan.");
        }
    }
}
