package com.git.rjc;

import org.junit.Test;

/**
 * @program: rjc
 * @description: junit
 * @author: R红茶
 * @create: 2020-02-26 10:31
 **/

public class JunitTest {
    @Test
    public void test(){
        String a = new String("a");

        String b = new String("a");

        System.out.println(a == b);

        System.out.println(a.equals(b));


    }
}
