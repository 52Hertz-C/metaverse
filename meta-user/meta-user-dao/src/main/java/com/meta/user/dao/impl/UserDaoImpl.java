package com.meta.user.dao.impl;

import com.meta.user.common.entity.User;
import com.meta.user.dao.UserDao;
import com.meta.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: metaverse
 * @description:
 * @packagename: com.meta.user.dao.impl
 * @author: cxy
 * @date: 2022-02-19 17:28:21
 **/
@Service
public class UserDaoImpl implements UserDao {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(Long userId) {
        return userMapper.selectById(userId);
    }

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateById(user);
    }
}
