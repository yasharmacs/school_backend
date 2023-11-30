package com.schoolbackend.service.impl;

import com.schoolbackend.model.StudentInfoVM;
import com.schoolbackend.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class StudentServiceImpl implements StudentService {

    public ResponseEntity<StudentInfoVM> addStudent(StudentInfoVM studentInfoVM){
        HttpStatus httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;

        //currently No validation --> direct save in DB.

        return  new ResponseEntity<>(httpStatus);
    }

}
