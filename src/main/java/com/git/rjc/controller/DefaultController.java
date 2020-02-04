package com.git.rjc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: rjc
 * @description: 欢迎页面
 * @author: R红茶
 * @create: 2019-12-31 15:04
 **/
@Controller
@RequestMapping("*")
public class DefaultController {
    @RequestMapping("*")
    public String hello(){
        return "hello.html";
    }
    @GetMapping("login")
    public String login(){
        return "login";
    }
    @GetMapping("index")
    public String index(){
        return "index";
    }


}
