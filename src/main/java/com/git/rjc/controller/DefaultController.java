package com.git.rjc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: rjc
 * @description: 欢迎页面
 * @author: R红茶
 * @create: 2019-12-31 15:04
 **/
@Controller
public class DefaultController {

    @GetMapping("login")
    public String login(){
        return "login";
    }
    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("message","Hello,It's my first git project.");
        return "index.html";
    }


}
