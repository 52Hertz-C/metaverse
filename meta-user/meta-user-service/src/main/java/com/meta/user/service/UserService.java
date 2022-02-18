package com.meta.user.service;

import com.meta.user.common.domain.dto.UserDTO;

public interface UserService {
    UserDTO getUser(Long userId);

    void updateUser(UserDTO userDTO);
}
