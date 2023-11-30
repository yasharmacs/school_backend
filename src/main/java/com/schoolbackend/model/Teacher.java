package com.schoolbackend.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Teacher {

    private String id;
    private Address address;
    private Name name;
    private Contact contact;
    private BankDetails bankDetails;

}

