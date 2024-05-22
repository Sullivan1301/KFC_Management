package com.hei.kfc_management.models;

public class Ingredients {
    private final int id;
    private final String name;
    private final Float price;
    private final Unity unity;

    public Ingredients(int id, String name, Float price, Unity unity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.unity = unity;
    }
}
