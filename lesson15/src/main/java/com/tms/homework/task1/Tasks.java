package com.tms.homework.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Tasks {

    public void getNumbers() { //1
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 15);
            list.add(num);
        }
        list.stream().map(x -> x * 2).forEach(System.out::println);
    }

    public void getEvenNumbers() { //2
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < 50; i++) {
            int num = (int) (Math.random() * 100);
            list.add(num);
        }

        list.stream()
                .filter(x -> x % 2 == 0 && x != 0)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

//    public String getNames() {
//        List<String> list = Arrays.asList("john", "arya", "sansa");
//        list.stream().peek((p) -> p.substring(0, 1).toUpperCase() + p.substring(1))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
//
//    }
}
