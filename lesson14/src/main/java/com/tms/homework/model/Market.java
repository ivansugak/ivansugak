package com.tms.homework.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Market {

    private List<Product> list = new ArrayList<>();


    public void add(Product product) {
        if (list.stream().noneMatch(p -> p.getId() == product.getId())) {
            list.add(product);
        }
    }

    public List<Product> getAllProduct() {
        return list;
    }

    public void update(Product product) {
        for (Product newProduct : list) {
            if (product.getId() == newProduct.getId()) {
                newProduct.setName(product.getName());
                newProduct.setPrice(product.getPrice());
            }
        }
    }

    public void delete(int id) {
        list.removeIf(o -> o.getId() == id);
    }
}