package com.schoolbackend.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamResultVM {
    private String id;
    private StudentVM student;
    private SubjectVM subject;
    private String examType;
    private int marksObtained;
}
