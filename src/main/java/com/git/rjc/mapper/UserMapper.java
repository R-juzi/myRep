package com.git.rjc.mapper;

import com.git.rjc.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * @program: rjc
 * @description: 用户dao
 * @author: R红茶
 * @create: 2020-01-30 15:21
 **/
public interface UserMapper {
    /**
     *
     * @param name
     * @param password
     * @return 按照用户名和密码查询用户
     */
    @Select("select * from user where name=#{name} and password=#{password}")
    public User getByNameAndPassword(String name,String password);

    /**
     * 增加用户
     * @param user
     */
    @Insert("insert into user values(#{id},#{name},#{password})")
    public void addUser(User user);
}
