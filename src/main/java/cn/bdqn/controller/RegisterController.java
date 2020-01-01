package cn.bdqn.controller;

import cn.bdqn.pojo.ShopUser;
import cn.bdqn.service.ShopUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class RegisterController {
    @Autowired
    private ShopUserService ss;
    @RequestMapping("register")
    public String toregister(){
        return "register";
    }

    @RequestMapping("/doregister")
    public String register(@RequestParam(value = "email",defaultValue ="") String email, @RequestParam(value = "username")String username,
                             @RequestParam(value = "password")String password, @RequestParam(value = "passwordRepeat")String passwordRepeat,
                             @RequestParam(value = "phone") String phone) {
        if (password.equals(passwordRepeat)) {
            ShopUser su =new ShopUser(username,password,email,phone);
            int insert = ss.insert(su);
            if (insert>0){
                return "login.html";
            }
        }
            return "register";
        }
}
