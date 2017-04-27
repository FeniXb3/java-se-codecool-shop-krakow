package com.codecool.shop.view;

import com.codecool.shop.model.Product;

import java.util.List;

public class ProductListView {
    List<Product> model;

    public void setModel(List<Product> model) {
        this.model = model;
    }

    public void render() {
        System.out.println(model.toString());
    }
}
