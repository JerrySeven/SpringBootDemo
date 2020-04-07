package cn.lemon.boot.service.Impl;

import cn.lemon.boot.dao.StudentDao;
import cn.lemon.boot.dto.StudentDto;
import cn.lemon.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public int addStudent(StudentDto studentDto) {
        return studentDao.addStudent(studentDto);
    }

    @Override
    public StudentDto getStudentById(int id) {
        return studentDao.getStudentById(id);
    }
}
