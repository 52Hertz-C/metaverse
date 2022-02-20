package com.meta.user.service.impl;

import com.meta.framework.utils.StringUtils;
import com.meta.user.common.enums.GenderEnum;
import com.meta.user.dao.UserDao;
import com.meta.user.pojo.dto.UserDTO;
import com.meta.user.pojo.dto.UserInfoDTO;
import com.meta.user.pojo.entity.User;
import com.meta.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public UserInfoDTO getUser(Long userId) {
        User user = userDao.getUser(userId);
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        BeanUtils.copyProperties(user, userInfoDTO);
        userInfoDTO.setGender(GenderEnum.covert2Desc(user.getGender()));
        return userInfoDTO;
    }

    @Override
    public void createUser(UserDTO userDTO) {
        checkUserDTO(userDTO);
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        user.setGender(userDTO.getGender().name());
        user.setCreateUserId(-1l);
        userDao.addUser(user);
    }

    private void checkUserDTO(UserDTO userDTO) {
        if (StringUtils.isBlank(userDTO.getUserName())
                || StringUtils.isBlank(userDTO.getPassword())
                || StringUtils.isBlank(userDTO.getConfirmPassword())) {

        }
        if (!userDTO.getPassword().equals(userDTO.getConfirmPassword())) {

        }
    }

    @Override
    public void updateUser(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        user.setGender(userDTO.getGender().name());
        userDao.updateUser(user);
    }

    private Boolean isExistUserName(String userName) throws Exception {
        if (StringUtils.isBlank(userName)) {
            throw new Exception("");
        }
        List<User> userList = userDao.getUserByUserName(userName);
        return CollectionUtils.isEmpty(userList)? Boolean.FALSE : Boolean.TRUE;
    }
}
