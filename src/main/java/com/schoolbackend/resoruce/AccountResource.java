package com.schoolbackend.resoruce;

import com.schoolbackend.model.StudentVM;
import com.schoolbackend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1")
public class AccountResource {

    @Autowired
    private StudentService studentService;

    @PostMapping(value="/addStudent")
    public ResponseEntity<StudentVM> addStudent(@RequestBody StudentVM studentInfoVM){
        return studentService.addStudent(studentInfoVM);
    }


}
