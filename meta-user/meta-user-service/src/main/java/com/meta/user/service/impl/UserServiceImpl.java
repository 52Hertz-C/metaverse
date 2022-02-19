package com.meta.user.service.impl;

import com.meta.user.common.pojo.dto.UserDTO;
import com.meta.user.dao.UserDao;
import com.meta.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public UserDTO getUser(Long userId) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userId);
        return userDTO;
    }

    @Override
    public void addUser(UserDTO userDTO) {
        userDao.addUser(userDTO);
    }

    @Override
    public void updateUser(UserDTO userDTO) {
    }
}
