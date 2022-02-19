package com.meta.user.controller;

import com.alibaba.fastjson.JSON;
import com.meta.user.common.pojo.dto.UserDTO;
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

    @PostMapping(value = "/addUser")
    @ApiOperation(value = "创建用户", notes = "创建用户")
    public void addUser(@RequestBody UserDTO userDTO) {
        log.info("addUser param is: {}", JSON.toJSONString(userDTO));
        userService.addUser(userDTO);
    }

    @PutMapping(value = "/updateUser")
    @ApiOperation(value = "获取用户信息", notes = "获取用户信息")
    public void updateUser(@RequestBody UserDTO userDTO) {
        log.info("updateUser param is: {}", JSON.toJSONString(userDTO));
        userService.updateUser(userDTO);
    }

    @GetMapping(value = "/getUser")
    @ApiOperation(value = "获取用户信息", notes = "获取用户信息")
    public UserDTO getUser(@RequestParam("userId") Long userId) {
        log.info("getUser param is: {}", userId);
        return userService.getUser(userId);
    }
}
