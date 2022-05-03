package com.org.tcs.service;

import com.org.tcs.model.Student;
import com.org.tcs.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentServiceImpl implements StudentSrevice {

    @Autowired
    StudentRepo studentRepo;
    @Override
    public void createStudent(Student student) {
        studentRepo.save(student);
    }
}
