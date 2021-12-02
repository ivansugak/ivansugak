package com.tms.homework.task6;

import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class Library {

    private List<Book> listL;
    private List<Reader> listR;
    private List<EmailAddress> listE;

    public Library(List<Book> listL, List<Reader> listR, List<EmailAddress> listE) {
        this.listL = listL;
        this.listR = listR;
        this.listE = listE;
    }

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

    public List<Book> getAllBooksFromReaders(List<Reader> listR) {
        return listR.stream()
                .flatMap(reader -> reader.getList().stream())
                .distinct()
                .collect(Collectors.toList());
    }

    public Long getCountReaderGetPushkin(List<Reader> listR) {
        return listR.stream()
                .flatMap(reader -> reader.getList().stream())
                .filter(book -> (book.getAuthor().equals("Пушкин Александр Сергеевич")))
                .count();
    }


}
