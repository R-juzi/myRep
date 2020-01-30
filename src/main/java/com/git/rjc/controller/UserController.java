package com.git.rjc.controller;

import com.git.rjc.entity.ResponseVO;
import com.git.rjc.entity.User;
import com.git.rjc.service.UserService;
import com.git.rjc.service.impl.UserServiceImpl;
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
    public ResponseVO doRegit(User user){
        if(user.getName()!=null&&user.getName()!=""&&user.getPassword()!=null&&user.getPassword()!=""){
            userService.addUser(user);
            return ResponseVO.SUC;
        }else{
            return ResponseVO.ERROR;
        }
    }

}
