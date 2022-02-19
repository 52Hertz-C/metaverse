package com.meta.user.service;

import com.meta.user.common.pojo.dto.UserDTO;
import com.meta.user.common.pojo.dto.UserInfoDTO;

public interface UserService {
    UserInfoDTO getUser(Long userId);

    void addUser(UserDTO userDTO);

    void updateUser(UserDTO userDTO);
}
