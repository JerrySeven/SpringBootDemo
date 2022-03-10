package com.lemon.aopdemo.service.impl;

import com.lemon.aopdemo.annotation.CheckAdmin;
import com.lemon.aopdemo.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    @CheckAdmin
    public void addStudent(String token) {
        System.out.println("新增学生信息——add");
    }

    @Override
    public void deleteStudent() {
        System.out.println("删除学生信息——delete");
    }

    @Override
    public void updateStudentInfo() {
        System.out.println("更新学生信息——update");
    }

    @Override
    public void selectStudentInfoByID() {
        System.out.println("查询学生信息——select");

    }
}
