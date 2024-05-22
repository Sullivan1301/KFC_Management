package com.hei.kfc_management.models;

public class Ingredients {
    private final int id;
    private final String name;
    private final Float price;
    private  final Menu menu;
    private final Unit unit;

    public Ingredients(int id, String name, Float price, Menu menu, Unit unit) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.menu = menu;
        this.unit = unit;
    }
}
