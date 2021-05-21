package com.example.searchdemo;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "item_description")
    private String description;

    @Column(name = "item_name")
    private String name;

    @Column(name = "item_path")
    private String path;

    @Column(name = "item_price")
    private double price;

    @Column(name = "item_qty")
    private int qty;

    public Item() {
    }

    public Item(long id, String description, String name, double price, int qty) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
