package com.schoolbackend.model;

import lombok.Data;
import org.springframework.data.couchbase.core.mapping.Document;

import java.util.List;

@Data
@Document
public class StudentInfo {

    private String studentName;
    private List<SubjectTeacher> subjects;
}
