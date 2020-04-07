package cn.lemon.jedisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.lemon.jedisdemo.dao")
public class JedisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JedisDemoApplication.class, args);
    }

}
