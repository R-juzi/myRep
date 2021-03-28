package com.git.rjc.controller;

import com.git.rjc.entity.ResponseVO;
import com.git.rjc.entity.User;
import com.git.rjc.exception.ServiceException;
import com.git.rjc.service.UserService;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
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
     * 先判断参数是否取到 然后调用add方法，如果捕获到异常则返回500 错误页面 嘟嘟嘟
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
    @ResponseBody
    public String doLogin(@Validated User user) {
        user = userService.login(user);
        if (user != null) {
            return "suc";
        } else {
            return "needReg";
        }
    }

    @GetMapping("index")
    public String myIndex() {
        return "index";
    }

    @GetMapping("multimedia")
    public String goMultimedia() {
        return "boxingtu.html";
    }
}
