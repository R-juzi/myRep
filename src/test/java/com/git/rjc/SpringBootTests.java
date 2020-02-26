package com.git.rjc;

import com.git.rjc.mapper.UserMapper;
import com.git.rjc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringBootTests {
@Resource
private UserService userService;
    @Resource
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        System.out.println(userMapper.getByNameAndPassword("rive","123"));
    }
    @Test
    public void test(){
        String a = new String("a");

        String b = new String("a");

        System.out.println(a == b);

        System.out.println(a.equals(b));


    }

}
