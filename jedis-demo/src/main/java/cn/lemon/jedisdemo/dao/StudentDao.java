package cn.lemon.jedisdemo.dao;

import cn.lemon.jedisdemo.dto.StudentDto;

public interface StudentDao {

    public StudentDto getStudentById(int id);

}
