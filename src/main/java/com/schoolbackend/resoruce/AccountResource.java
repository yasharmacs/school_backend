package com.schoolbackend.resoruce;

import com.schoolbackend.model.StudentInfoVM;
import com.schoolbackend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/v1")
public class AccountResource {

    @Autowired
    private StudentService studentService;
    @PostMapping(value="/addStudent")
    public ResponseEntity<StudentInfoVM> addStudent(@RequestBody StudentInfoVM studentInfoVM){
        return studentService.addStudent(studentInfoVM);
    }


}
