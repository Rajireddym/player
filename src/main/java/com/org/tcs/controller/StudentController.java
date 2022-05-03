package com.org.tcs.controller;

import com.org.tcs.model.Student;
import com.org.tcs.repository.StudentRepo;
import com.org.tcs.service.StudentSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class StudentController {
    @Autowired
    StudentSrevice studentSrevice;


    @PostMapping("/create")
    public void createStudent(@RequestBody Student student){
        studentSrevice.createStudent(student);
    }
}
