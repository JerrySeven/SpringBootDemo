package cn.lemon.boot;

import javafx.application.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("cn.lemon.boot.dao")
public class BootApplication {//extends SpringBootServletInitializer {

    public static void main(String[] args) {
//        //正常启动
        SpringApplication.run(BootApplication.class, args);

        //外部启动
//        new SpringApplicationBuilder(Application.class).web(WebApplicationType.SERVLET).run(args);
    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
//        return builder.sources(BootApplication.class);
//    }

}
