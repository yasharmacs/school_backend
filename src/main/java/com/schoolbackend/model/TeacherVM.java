package com.schoolbackend.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import java.util.Date;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class TeacherVM {
    @Id
    private String empId;
    private AddressVM address;
    private NameVM name;
    private Date dob;
    private ContactVM contact;
    private BankDetailsVM bankDetails;

}

