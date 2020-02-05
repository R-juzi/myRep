package com.git.rjc.controller;

import com.git.rjc.entity.ResponseVO;
import com.git.rjc.entity.User;
import com.git.rjc.exception.ServiceException;
import com.git.rjc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @program: rjc
 * @description: 用户controller
 * @author: R红茶
 * @create: 2020-01-30 16:05
 **/
@RequestMapping("user")
@SessionAttributes("user")
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("regit")
    public String goRegit() {
        return "regit";
    }

    @PostMapping("regit")
    /**
     * 先判断参数是否取到 然后调用add方法，如果捕获到异常则返回500 错误页面
     */
    @ResponseBody
    public ResponseVO doRegit(User user) {
        if (user.getName() != null && user.getName() != "" && user.getPassword() != null && user.getPassword() != "") {
            try {
                userService.addUser(user);
                return ResponseVO.SUC;
            } catch (ServiceException e) {
                e.printStackTrace();
                return ResponseVO.ERROR;
            }
        } else {
            return ResponseVO.ERROR;
        }
    }
//前端请求使用ajax 后台响应改成统一格式 在前台做跳转
    @PostMapping("login")
    public String doLogin(User user, Model model) {
        if (user.getName() != null && user.getName() != "" && user.getPassword() != null && user.getPassword() != "") {
            if (userService.login(user) != null) {
                model.addAttribute("user",user);
                model.addAttribute("message","登陆成功");
                return "index.html";
            } else {
                model.addAttribute("name",user.getName());
                model.addAttribute("message","账号或密码不正确");
                return "login";
            }
        } else {
            model.addAttribute("name",user.getName());
            model.addAttribute("message","非法输入");
            return "login";
        }
    }
}
