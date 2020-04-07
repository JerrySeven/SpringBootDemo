package cn.lemon.jedisdemo;

import cn.lemon.jedisdemo.dao.StudentDao;
import cn.lemon.jedisdemo.dto.StudentDto;
import cn.lemon.jedisdemo.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JedisDemoApplicationTests {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private StudentService studentService;
    @Test
    public void contextLoads() {
    }

    @Test
    public void testMysqlConnection(){
        StudentDto studentDto = studentDao.getStudentById(2);
        System.out.println("mybatis测试：" + studentDto.toString());
    }

    @Test
    public void testJedis(){
        Map<String, String> studentById = studentService.getStudentById(4);
        System.out.println(studentById.toString());
    }
}
