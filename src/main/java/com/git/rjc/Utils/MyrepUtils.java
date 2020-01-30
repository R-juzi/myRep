package com.git.rjc.Utils;

import java.util.UUID;

;

/**
 * @program: rjc
 * @description: 我的工具类
 * @author: R红茶
 * @create: 2020-01-30 15:31
 **/
public class MyrepUtils {
    /**
     * @return 返回32位随机字符串
     */
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
