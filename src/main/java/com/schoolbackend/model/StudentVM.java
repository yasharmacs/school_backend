package com.schoolbackend.model;

import com.schoolbackend.constants.StudentClass;
import com.schoolbackend.constants.StudentStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
 import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document
public class StudentVM {
    @Id
    private String rollNo;
    private NameVM name;
    private BankDetailsVM bankDetailsVM;
    private AddressVM address;
    private Date dob;
    private StudentClass studentClass;
    private ContactVM contact;
    private Date createdAt;
    private Date updatedAt;
    private String classId="401";

    private StudentStatusEnum status;

    //String -> Class
    private Map<String,List<ExamResultVM>> currentClassExamResult;

    private Map<String,List<ExamResultVM> > historicClassExamResult;
}

