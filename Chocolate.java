package ru.geekbrains.lesson1;

public class Chocolate extends Product {

    private String type; // Тип шоколада (молочный, горький и т. д.)
    private double cocoaPercentage; // Процент какао в шоколаде

    public Chocolate() {
        super("Chocolate", "GenericBrand", 2.50);
        setType("Milk"); // Устанавливаем тип по умолчанию
        setCocoaPercentage(30.0); // Устанавливаем процент какао по умолчанию
    }

    public Chocolate(String name, String brand, double price, String type, double cocoaPercentage) {
        super(name, brand, price);
        setType(type);
        setCocoaPercentage(cocoaPercentage);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCocoaPercentage() {
        return cocoaPercentage;
    }

    public void setCocoaPercentage(double cocoaPercentage) {
        this.cocoaPercentage = cocoaPercentage;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + String.format(" - Type: %s - Cocoa: %.2f%%", type, cocoaPercentage);
    }
}
