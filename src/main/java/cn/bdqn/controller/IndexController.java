package cn.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {

    @RequestMapping("/login.html")
    public String toIndex(){
        return "login";
    }
    @RequestMapping("/login")
    public String tologin(){
        return "home";
    }
}
