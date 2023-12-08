package com.schoolbackend.service.impl;

import com.schoolbackend.model.StudentVM;
import com.schoolbackend.repository.StudentRepository;
import com.schoolbackend.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    public ResponseEntity<StudentVM> addStudent(StudentVM studentInfoVM){
        HttpStatus httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
        log.debug("Calling AddStudent {}",studentInfoVM);
        System.out.println("Calling AddStudent {}"+studentInfoVM);
//        StudentInfoVM studentInfoVM1=new StudentInfoVM();
//        studentInfoVM1.setRollNo("23");
        try{
            studentInfoVM.setName(studentInfoVM.getName());
            studentRepository.save(studentInfoVM);
            httpStatus=HttpStatus.OK;
        }catch(Exception e){
            log.debug("FAiled to save in DB {}",e);
            System.out.println("FAiled to save in DB" + e);
        }


        return  new ResponseEntity<>(httpStatus);
    }

}
