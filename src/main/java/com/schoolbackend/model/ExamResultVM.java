package com.schoolbackend.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamResultVM {
    @Id
    private String id;
    private SubjectVM subject;
    private String examType;
    private int marksObtained;
}
