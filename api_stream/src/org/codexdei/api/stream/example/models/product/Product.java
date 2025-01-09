package org.codexdei.api.stream.example.models.product;

public class Product {

    private String productName;
    private CATEGORY category;
    private double price;
    private int quantitySould;
    private int stock;


    public Product(String productName, CATEGORY category, double price, int quantity, int stock) {
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantitySould = quantity;
        this.stock = stock;
    }
    //ventas
    public Product(String productName, CATEGORY category, double price, int quantitySould) {
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantitySould = quantitySould;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public CATEGORY getCategory() {
        return category;
    }

    public void setCategory(CATEGORY category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantitySould() {
        return quantitySould;
    }

    public void setQuantitySould(int quantitySould) {
        this.quantitySould = quantitySould;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getTotalPriceSould(){
        return price * quantitySould;
    }

    @Override
    public String toString() {

        return "Product{" +
                "productName='" + productName + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", quantity=" + quantitySould +
                ", stock=" + stock +
                '}';
    }
}
