package com.schoolbackend.model;

import com.schoolbackend.constants.StudentClass;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class StudentInfoVM {

    private String rollNo;
    private Name name;
    private String version;
    private Address address;
    private Date dob;
    private StudentClass studentClass;

}
