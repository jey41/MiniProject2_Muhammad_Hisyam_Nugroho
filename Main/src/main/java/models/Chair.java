/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class Chair extends Furniture {
    private String material;

    // Constructor
    public Chair(String name, double price, String material) {
        super(name, price, "Chair");
        this.material = material;
    }

    // Getter dan Setter
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Material: " + material);
    }
}