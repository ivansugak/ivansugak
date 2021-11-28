package com.tms.homework.task6;

import lombok.Data;

@Data
public class EmailAddress {
    private String email;
    private String additionalInformation;

    public EmailAddress(String email) {
        this.email = email;
    }
}
