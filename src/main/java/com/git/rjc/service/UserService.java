package com.git.rjc.service;

import com.git.rjc.entity.User;

/**
 * @program: rjc
 * @description: 用户接口
 * @author: R红茶
 * @create: 2020-01-30 15:18
 **/
public interface UserService {
    /**
     * @param user
     * @return 登录成功返回查询到的用户实例，否则返回属性为null的实例
     */
    public User login(User user);

    /**
     * 增加用户 参数user id不为空会被忽略
     * @param user
     */
    public void addUser(User user);
}
