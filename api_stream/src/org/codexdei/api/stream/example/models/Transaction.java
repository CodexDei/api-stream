package org.codexdei.api.stream.example.models;

import org.codexdei.api.stream.example.models.product.Product;

public class Transaction {

    private User user;
    private Product product;

    public Transaction(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "user=" + user +
                ", product=" + product +
                '}';
    }
}
