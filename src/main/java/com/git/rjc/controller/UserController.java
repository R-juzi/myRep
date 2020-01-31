package com.git.rjc.controller;

import com.git.rjc.entity.User;
import com.git.rjc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @program: rjc
 * @description: 用户controller
 * @author: R红茶
 * @create: 2020-01-30 16:05
 **/
@RequestMapping("user")
@Controller
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping("regit")
    public String goRegit(){
        return "regit";
    }
    @PostMapping("regit")
    public String doRegit(User user){
        if(user.getName()!=null&&user.getName()!=""&&user.getPassword()!=null&&user.getPassword()!=""){
            userService.addUser(user);
            return "suc";
        }else{
            return "error";
        }
    }
    @PostMapping("login")
    public String doLogin(User user){
        if(user.getName()!=null&&user.getName()!=""&&user.getPassword()!=null&&user.getPassword()!=""){
            if(userService.login(user).getId()!=null){
                return "suc";
            }else{
                return "error";
            }
        }else{
            return "error";
        }
    }
}
