package cn.lemon.boot.service;

import cn.lemon.boot.dto.StudentDto;

public interface StudentService {

    public int addStudent(StudentDto studentDto);

    public StudentDto getStudentById(int id);
}
