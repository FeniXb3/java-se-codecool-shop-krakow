package com.codecool.shop.dao;

import com.codecool.shop.model.ProductCategory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class ProductCategoryDaoHardcoded implements ProductCategoryDao {
    private List<ProductCategory> categories;

    public ProductCategoryDaoHardcoded() {
        categories = new ArrayList<>();
        ProductCategory first = new ProductCategory("Category",
                "Department",
                "Category description"
        );
        first.setId(1);
        ProductCategory second = new ProductCategory("Another Category",
                "Department",
                "Category description"
        );
        second.setId(2);

        categories.add(first);
        categories.add(second);
    }

    @Override
    public void add(ProductCategory category) {
        throw new NotImplementedException();
    }

    @Override
    public ProductCategory find(int id) {
        for(ProductCategory category:categories) {
            if(category.getId() == id) {
                return  category;
            }
        }

        return null;
    }

    @Override
    public void remove(int id) {
        throw new NotImplementedException();
    }

    @Override
    public List<ProductCategory> getAll() {
        throw new NotImplementedException();
    }
}
