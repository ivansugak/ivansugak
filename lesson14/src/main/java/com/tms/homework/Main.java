package com.tms.homework;

import com.tms.homework.model.Market;
import com.tms.homework.model.Product;

import java.util.Collections;
import java.util.stream.Collectors;

import static com.tms.homework.util.IdGenerator.generateBookId;

public class Main {
    public static void main(String[] args) {

        Market market = new Market();
        Product product1 = new Product(generateBookId(), "Bread", 20.5f);
        Product product2 = new Product(generateBookId(), "Milk", 40.0f);
        Product product3 = new Product(generateBookId(), "Sausage", 110.1f);
        Collections.addAll(market.getList(), product1, product2, product3);

        System.out.println(market.getList().stream()
                .sorted((o1, o2) -> o2.getId() - o1.getId())
                .collect(Collectors.toList()));

        market.delete(2);

        System.out.println(market.getList().stream()
                .sorted((o1, o2) -> o2.getId() - o1.getId())
                .collect(Collectors.toList()));

        market.update(new Product(product1.getId(), "Bread3333", 3330.5f));

        System.out.println(market.getList().stream()
                .sorted((o1, o2) -> o2.getId() - o1.getId())
                .collect(Collectors.toList()));
    }
}
