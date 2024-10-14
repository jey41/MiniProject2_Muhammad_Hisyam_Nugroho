/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class Table extends Furniture {
    private int numberOfLegs;

    // Constructor
    public Table(String name, double price, int numberOfLegs) {
        super(name, price, "Table");
        this.numberOfLegs = numberOfLegs;
    }

    // Getter dan Setter
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Jumlah Kaki: " + numberOfLegs);
    }
}