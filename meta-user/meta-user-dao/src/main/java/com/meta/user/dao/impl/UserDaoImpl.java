package com.meta.user.dao.impl;

import com.meta.user.common.config.utils.DateUtils;
import com.meta.user.common.domain.User;
import com.meta.user.common.pojo.dto.UserDTO;
import com.meta.user.dao.UserDao;
import com.meta.user.mapper.UserMapper;
import org.springframework.beans.BeanUtils;
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
    public void addUser(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        user.setCreateUserId(-1l);
        userMapper.insert(user);
    }
}
