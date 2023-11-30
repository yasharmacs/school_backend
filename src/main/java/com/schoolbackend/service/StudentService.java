package com.schoolbackend.service;

import com.schoolbackend.model.StudentInfoVM;
import org.springframework.http.ResponseEntity;

public interface StudentService {
    ResponseEntity<StudentInfoVM> addStudent(StudentInfoVM studentInfoVM);
}
