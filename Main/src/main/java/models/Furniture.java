/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

// Menggunakan final keyword untuk kelas dan properti
public class Furniture {
    private String name;
    private double price;
    private final String type;

    // Constructor
    public Furniture(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    // Getter dan Setter (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    // Method untuk menampilkan detail furniture
    public void displayDetails() {
        System.out.println("Nama: " + name);
        System.out.println("Harga: " + price);
        System.out.println("Jenis: " + type);
    }
}