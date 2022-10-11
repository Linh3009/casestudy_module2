package models;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String describe;
    private double price;
    private int amount;

    public Product() {
    }

    public Product(int id, String name, String describe, double price, int amount) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.price = price;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
