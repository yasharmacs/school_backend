package com.schoolbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.couchbase.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class SubjectEnrollment {

    private StudentVM student;
    private TeacherVM teacher;
    private SubjectVM subject;
}
