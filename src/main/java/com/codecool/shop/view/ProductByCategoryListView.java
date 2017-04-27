package com.codecool.shop.view;

import com.codecool.shop.model.Product;

import java.util.List;

public class ProductByCategoryListView {
    private List<Product> model;

    public void setModel(List<Product> model) {
        this.model = model;
    }

    public void render() {
        System.out.println("PRODUCT LIST BY CATEGORY");
        System.out.println(model.toString());
    }
}
