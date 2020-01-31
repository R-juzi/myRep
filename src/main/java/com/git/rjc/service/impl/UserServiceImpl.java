package com.git.rjc.service.impl;

import com.git.rjc.Utils.MyrepUtils;
import com.git.rjc.entity.User;
import com.git.rjc.exception.NameExitException;
import com.git.rjc.mapper.UserMapper;
import com.git.rjc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: rjc
 * @description:
 * @author: R红茶
 * @create: 2020-01-30 15:21
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.getByNameAndPassword(user.getName(),user.getPassword());
    }

    @Override
    public void addUser(User user) {
        if(userMapper.getByNameAndPassword(user.getName(),user.getPassword()).getId()!=null){
            user.setId(MyrepUtils.getUUID());
            userMapper.addUser(user);
        }else{
            throw new NameExitException();
        }
    }
}
