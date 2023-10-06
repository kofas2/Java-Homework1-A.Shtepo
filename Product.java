package ru.geekbrains.lesson1;

public class Product {

    protected String name;
    protected String brand;
    protected double price;
    protected int calories; // Новое свойство для калорий

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        checkPrice(price);
    }

    public int getCalories() {
        return calories; // Геттер для калорий
    }

    public void setCalories(int calories) {
        checkCalories(calories); // Сеттер для калорий
    }

    public Product() {
        this("<Product>");
    }

    public Product(String name) {
        this(name, 100);
    }

    public Product(String name, double price) {
        this("<Brand>", name, price);
    }

    public Product(String brand, String name, double price) {
        checkBrand(brand);
        checkName(name);
        checkPrice(price);
        setCalories(0); // Инициализация калорий по умолчанию
    }

    private void checkBrand(String brand) {
        if (brand == null || brand.length() < 3) {
            this.brand = "<Brand>";
        } else {
            this.brand = brand;
        }
    }

    private void checkName(String name) {
        if (name == null || name.length() < 3) {
            this.name = "<Product>";
        } else {
            this.name = name;
        }
    }

    private void checkPrice(double price) {
        if (price < 100) {
            this.price = 100;
        } else {
            this.price = price;
        }
    }

    private void checkCalories(int calories) {
        if (calories < 0) {
            this.calories = 0;
        } else {
            this.calories = calories;
        }
    }

    public String displayInfo() {
        return String.format("%s - %s - %.2f - %d calories", brand, name, price, calories);
    }
}
