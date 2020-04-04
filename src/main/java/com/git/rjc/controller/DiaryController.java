package com.git.rjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: rjc
 * @description: 日记ctl
 * @author: R红茶
 * @create: 2020-04-04 21:13
 **/
@Controller
@RequestMapping("/my")
public class DiaryController {
    @GetMapping("/diary")
    public String getDiary(){
        return "myDiary";
    }
}
