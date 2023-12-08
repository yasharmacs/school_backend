package com.schoolbackend.service;

import com.schoolbackend.model.StudentVM;
import org.springframework.http.ResponseEntity;

public interface StudentService {
    ResponseEntity<StudentVM> addStudent(StudentVM studentInfoVM);
}
