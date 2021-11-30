package com.tms.homework.task5;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class Person {
    public static final String MALE = "male";
    public static final String FEMALE = "female";
    private String name;
    private Integer age;
    private String sex = FEMALE;
    private List<Person> personList;

    public Person(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public List<Person> getPersonList() {
        if (personList == null) {
            return new ArrayList<>();
        }
        return personList;
    }

    public static void getNameD(List<Person> personList) {

        StringJoiner joiner = new StringJoiner(", ");
        for (Person person : personList) {
            if ((person.getName().charAt(0) == 'Д')) {
                joiner.add(person.getName());
            }
        }
        String string = Optional.of(joiner.toString()).get();
        System.out.println(string);

    }
}
