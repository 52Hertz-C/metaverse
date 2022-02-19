package com.meta.user.dao;

import com.meta.user.common.pojo.dto.UserDTO;

/**
 * @program: metaverse
 * @description:
 * @packagename: com.meta.user.dao
 * @author: cxy
 * @date: 2022-02-19 17:27:58
 **/
public interface UserDao {
    void addUser(UserDTO userDTO);
}
