package com.lemon.aopdemo.service.impl;

import com.lemon.aopdemo.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

@SpringBootTest
@RunWith(SpringRunner.class)
class StudentServiceImplTest {

    @Autowired
    private StudentService studentService;

    @Test
    void addStudent() {
        studentService.addStudent("7771");
    }

    @Test
    void deleteStudent() {
    }

    @Test
    void updateStudentInfo() {
    }

    @Test
    void selectStudentInfoByID() {
    }
}