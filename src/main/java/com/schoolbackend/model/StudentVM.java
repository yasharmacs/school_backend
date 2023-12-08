package com.schoolbackend.model;

import com.schoolbackend.constants.StudentClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document
public class StudentVM {
    @Id
    private String rollNo;
    private NameVM name;
    private String version;
    private AddressVM address;
    private Date dob;
    private StudentClass studentClass;
    private ContactVM contact;
    private Date createdAt;
    private Date updatedAt;
    private String classId="401";
}
