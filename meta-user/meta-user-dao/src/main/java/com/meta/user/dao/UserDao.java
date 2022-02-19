package com.meta.user.dao;

import com.meta.user.common.entity.User;

/**
 * @program: metaverse
 * @description:
 * @packagename: com.meta.user.dao
 * @author: cxy
 * @date: 2022-02-19 17:27:58
 **/
public interface UserDao {

    User getUser(Long userId);

    void addUser(User user);

    void updateUser(User user);
}
