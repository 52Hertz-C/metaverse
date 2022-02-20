package com.meta.user.service;

import com.meta.user.pojo.dto.UserDTO;
import com.meta.user.pojo.dto.UserInfoDTO;

public interface UserService {
    UserInfoDTO getUser(Long userId);

    void createUser(UserDTO userDTO);

    void updateUser(UserDTO userDTO);
}
