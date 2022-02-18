package com.meta.user.controller;

import com.meta.user.common.domain.dto.UserDTO;
import com.meta.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: metaverse
 * @description: 用户
 * @author: 52Hz
 * @create: 2022-02-17 11:23
 **/
@RestController
@RequestMapping
@Slf4j
@Api(tags = "用户信息管理接口")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/getUser")
    @ApiOperation(value = "获取用户信息", notes = "获取用户信息")
    public UserDTO getUser(@RequestParam("userId") Long userId) {
        log.info("getUser param is: {}", userId);
        return userService.getUser(userId);
    }
}
