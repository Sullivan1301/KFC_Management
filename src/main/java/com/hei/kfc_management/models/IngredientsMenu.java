package com.hei.kfc_management.models;

public class IngredientsMenu {
    private final String id;
    private final Menu menu;
    private final Ingredients ingredients;

    public IngredientsMenu(String id, Menu menu, Ingredients ingredients) {
        this.id = id;
        this.menu = menu;
        this.ingredients = ingredients;
    }
}
