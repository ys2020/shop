package cn.bdqn.controller;

import cn.bdqn.service.ShopUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
    @Autowired
    private ShopUserService ss;
    @RequestMapping("register")
    public String toregister(){
        return "register";
    }

    @RequestMapping("doregister")
    public String doregister(@Param("email") String email, @Param("username")String username,
                             @Param("password")String password, @Param("passwordRepeat")String passwordRepeat) {
        if (password.equals(passwordRepeat)) {

        }
            return "login.html";
        }
}
