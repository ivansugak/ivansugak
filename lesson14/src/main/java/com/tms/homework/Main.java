package com.tms.homework;

import com.tms.homework.model.Market;
import com.tms.homework.model.Product;

import java.math.BigDecimal;
import java.util.stream.Collectors;

import static com.tms.homework.util.IdGenerator.generateBookId;

public class Main {
    public static void main(String[] args) {

        Market market = new Market();
        BigDecimal bigDecimal1 = new BigDecimal("40.0");
        BigDecimal bigDecimal2 = new BigDecimal("20.5");
        BigDecimal bigDecimal3 = new BigDecimal("110.1");
        BigDecimal bigDecimal4 = new BigDecimal("3330.5");
        Product product1 = new Product(generateBookId(), "Bread", bigDecimal1);
        Product product2 = new Product(generateBookId(), "Milk", bigDecimal2);
        Product product3 = new Product(generateBookId(), "Sausage", bigDecimal3);
        market.add(product1);
        market.add(product2);
        market.add(product3);

        System.out.println(market.getList().stream()
                .sorted((o1, o2) -> o2.getPrice().compareTo(o1.getPrice()))
                .collect(Collectors.toList()));

        market.delete(2);

        System.out.println(market.getList().stream()
                .sorted((o1, o2) -> o2.getId() - o1.getId())
                .collect(Collectors.toList()));

        market.update(new Product(product1.getId(), "Bread3333", bigDecimal4));

        System.out.println(market.getList().stream()
                .sorted((o1, o2) -> o2.getId() - o1.getId())
                .collect(Collectors.toList()));
    }
}
