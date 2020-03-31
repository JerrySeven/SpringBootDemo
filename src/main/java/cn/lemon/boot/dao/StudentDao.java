package cn.lemon.boot.dao;

import cn.lemon.boot.dto.StudentDto;

public interface StudentDao {

    public int addStudent(StudentDto studentDto);

    public StudentDto getStudentById(int id);
}
