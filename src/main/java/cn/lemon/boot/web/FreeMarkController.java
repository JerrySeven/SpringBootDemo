package cn.lemon.boot.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FreeMarkController {

    @GetMapping("freemark")
    public String free(){
        return "freemark";
    }
}
