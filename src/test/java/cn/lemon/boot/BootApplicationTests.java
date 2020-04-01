package cn.lemon.boot;

import ch.qos.logback.core.net.SyslogOutputStream;
import cn.lemon.boot.dao.StudentDao;
import cn.lemon.boot.dto.StudentDto;
import cn.lemon.boot.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {

    @Autowired
    private StudentService studentService;

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void contextLoads() {
    }

    @Test
    public void testStrudent(){
        StudentDto studentDto = studentService.getStudentById(1);
        System.out.println(studentDto.toString());
    }

    /**测试redis写入功能*/
    @Test
    public void testRedisAdd(){
        redisTemplate.opsForValue().set("name","Lemon");
    }
    /**测试redis的get功能*/
    @Test
    public void testRedisGet(){
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println("得到redis的值：" + name);
    }
}
