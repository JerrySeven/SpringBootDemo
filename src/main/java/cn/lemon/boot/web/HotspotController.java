package cn.lemon.boot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HotspotController {

    @GetMapping("showHtml22.do")
    public String showhtml(){
        String string  = "1";
        return "index.html";
    }
}
