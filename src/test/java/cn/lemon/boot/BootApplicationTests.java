package cn.lemon.boot;

import cn.lemon.boot.dao.StudentDao;
import cn.lemon.boot.dto.StudentDto;
import cn.lemon.boot.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {

    @Autowired
    private StudentService studentService;
    @Test
    public void contextLoads() {
    }

    @Test
    public void testStrudent(){
        StudentDto studentDto = studentService.getStudentById(1);
        System.out.println(studentDto.toString());
    }
}
