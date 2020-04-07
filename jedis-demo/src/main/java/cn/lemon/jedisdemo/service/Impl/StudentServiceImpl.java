package cn.lemon.jedisdemo.service.Impl;

import cn.lemon.jedisdemo.dao.StudentDao;
import cn.lemon.jedisdemo.dto.StudentDto;
import cn.lemon.jedisdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.Map;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private JedisPool jedisPool;

    @Override
    public Map<String, String> getStudentById(int id) {
        Jedis jedis = jedisPool.getResource();
        Map<String, String> map = new HashMap<>();
        if (jedis.exists("student:" + id)) {
            map = jedis.hgetAll("student:" + id);
            System.out.println("从redis中获取学生信息");

        } else {
            StudentDto studentDto = studentDao.getStudentById(id);
            map.put("sno", studentDto.getSno() + "");
            map.put("sname", studentDto.getSname());
            map.put("sex", studentDto.getSex());
            map.put("sage", studentDto.getSage() + "");
            map.put("sdept", studentDto.getSdept());
            String hmset = jedis.hmset("student:" + id, map);
            System.out.println("将数据库查出的值存入redis");
        }

        return map;
    }
}
