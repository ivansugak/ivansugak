package com.tms.homework.task6;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class Library {
    private List<Book> listL = new ArrayList<>();
    private List<Reader> listR = new ArrayList<>();
    private List<EmailAddress> listE = new ArrayList<>();

    public List<Book> getListBook(List<Book> listBook) {
        return listBook.stream()
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .collect(Collectors.toList());
    }

    public List<EmailAddress> getListEmail(List<Reader> listEmail) {
        return listEmail.stream()
                .map(Reader::getEmailAddress)
                .collect(Collectors.toList());
    }

    public List<EmailAddress> getListEmailAndBooks(List<Reader> listEmail) {
        return listEmail.stream()
                .filter(p -> (p.isMailing() && p.getList().size() >= 2))
                .map(Reader::getEmailAddress)
                .collect(Collectors.toList());
    }
}
