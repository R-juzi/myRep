package com.git.rjc.Utils;

import com.git.rjc.RjcApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
/**
 * @Author:     23133
 * @Description:    
 * @Date:    2021/3/6 13:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RjcApplication.class)
public class JwtTokenUtilTest {
    @Autowired
     private Audience audience;
    @Test
    public void createJWT() {
        System.out.println(JwtTokenUtil.createJWT("001", "杜波", "中单", audience));
    }
}