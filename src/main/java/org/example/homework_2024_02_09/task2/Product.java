package org.example.homework_2024_02_09.task2;

public class Product {

    private String title;
    private int price;
    private boolean isInStock;

    public Product(String title, int price, boolean isInStock) {
        this.title = title;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return isInStock;
    }


    @Override
    public String toString() {
        return "Product{" +
                "Title='" + title + '\'' +
                ", Price=" + price +
                ", InStock=" + isInStock +
                '}';
    }
}
