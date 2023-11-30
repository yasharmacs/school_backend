package com.schoolbackend.model;


import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Teacher {

    private String id;
    private Address address;
    private Name name;
    private Date dob;
    private Contact contact;
    private BankDetails bankDetails;

}

