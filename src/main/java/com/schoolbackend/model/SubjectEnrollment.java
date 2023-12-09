package com.schoolbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class SubjectEnrollment {

    @Id
    private String subjectEnrollmentId;
    private String teacherEmpId;
    private String subjectId;
}
