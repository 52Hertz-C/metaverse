package com.meta.user.dao;

import com.meta.user.pojo.entity.User;

import java.util.List;

/**
 * @program: metaverse
 * @description:
 * @packagename: com.meta.user.dao
 * @author: cxy
 * @date: 2022-02-19 17:27:58
 **/
public interface UserDao {

    User getUser(Long userId);

    List<User> getUserByUserName(String userName);

    void addUser(User user);

    void updateUser(User user);
}
