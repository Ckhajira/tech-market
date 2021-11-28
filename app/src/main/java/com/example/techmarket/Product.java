package com.example.techmarket;

public class Product {
    private int id;
    private String name;
    private int price;
    private String imageUrl;
    private String shortDesc;
    private String longDesc;

    public Product(int id, String name, int price, String imageUrl, String shortDesc, String longDesc) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
    }
}
