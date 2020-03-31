package cn.lemon.boot.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
spring会扫描主类（主方法的那个）所在包和其子包，也就是说主包名com.example.demo,
那么不论是Service还是Controller的包名都必须是com.example.demo.(xxx),包名不在子包下 的话就要加上@ComponentScan(".......")
*/
@Controller
public class IndexController {

    @GetMapping("index")
    @ResponseBody
    public String index(){
        return "Hello world! 乱码";
    }
}
