package com.schoolbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import java.util.List;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class StudentInfo {

    @Id
    private String studentInfoId;
    private String studentName;

    private String studentRollNo;
    private List<SubjectTeacher> subjects;
}
