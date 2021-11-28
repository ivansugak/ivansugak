package com.tms.homework.task6;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Reader {
    private String name;
    private EmailAddress emailAddress;
    private boolean mailing;
    private List<Book> list = new ArrayList<>();

    public Reader(String name, EmailAddress emailAddress, boolean mailing) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.mailing = mailing;
    }
}
