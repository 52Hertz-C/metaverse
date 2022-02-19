package com.meta.user.service;

import com.meta.user.common.pojo.dto.UserDTO;

public interface UserService {
    UserDTO getUser(Long userId);

    void addUser(UserDTO userDTO);

    void updateUser(UserDTO userDTO);
}
