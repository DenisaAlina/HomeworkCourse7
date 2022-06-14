package com.fasttrack;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public boolean hasStock() {
        if (this.quantity != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isCategory(String category) {
        return this.category.equalsIgnoreCase(category);
    }
}
