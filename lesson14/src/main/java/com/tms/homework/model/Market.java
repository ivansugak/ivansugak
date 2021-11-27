package com.tms.homework.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Market {

    private List<Product> list = new ArrayList<>();


    public void add(Product product) {
        for (int i = 0; i < list.size(); i++) {
            boolean result = product.getId() == list.get(i).getId();
            if (!result) {
                list.add(product);
            }
        }
    }

    public List<Product> getAllProduct() {
        return list;
    }

    public void update(Product product) {
        for (Product newProduct : list) {
            if (product.getId() == (newProduct.getId())) {
                newProduct.setName(product.getName());
                newProduct.setPrice(product.getPrice());
            }
        }
    }

    public void delete(Product product) {
        boolean result = list.stream().anyMatch(s -> s.getId() == product.getId());
        if (result) {
            list.remove(product);
        }
    }
}