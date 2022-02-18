package com.meta.user.service.impl;

import com.meta.user.common.domain.dto.UserDTO;
import com.meta.user.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDTO getUser(Long userId) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userId);
        return userDTO;
    }

    @Override
    public void updateUser(UserDTO userDTO) {
    }
}
