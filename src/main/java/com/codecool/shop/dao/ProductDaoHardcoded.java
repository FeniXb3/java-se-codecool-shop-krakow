package com.codecool.shop.dao;

import com.codecool.shop.model.Product;
import com.codecool.shop.model.ProductCategory;
import com.codecool.shop.model.Supplier;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoHardcoded implements ProductDao {
    @Override
    public void add(Product product) {
        throw new NotImplementedException();
    }

    @Override
    public Product find(int id) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(int id) {
        throw new NotImplementedException();
    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("First",
                1.0f,
                "PLN",
                "First description",
                new ProductCategory("Category",
                        "Department",
                        "Category description"
                ),
                new Supplier("First Supplier", "Description")
        ));
        products.add(new Product("Second",
                1.0f,
                "PLN",
                "Second description",
                new ProductCategory("Another Category",
                        "Department",
                        "Category description"
                ),
                new Supplier("Second Supplier", "Description")
        ));
        return products;
    }

    @Override
    public List<Product> getBy(Supplier supplier) {
        throw new NotImplementedException();
    }

    @Override
    public List<Product> getBy(ProductCategory productCategory) {
        throw new NotImplementedException();
    }
}
