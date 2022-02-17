package com.meta.user.common.domain.dto;

import lombok.Data;

import java.util.Date;

/**
 * @program: metaverse
 * @description:
 * @author: 52Hz
 * @create: 2022-02-17 11:33
 **/
@Data
public class UserDTO {

//    @ApiModelProperty("用户id")
    private Long userId;

//    @ApiModelProperty("用户名称")
    private String userName;

//    @ApiModelProperty("年龄")
    private Integer age;

//    @ApiModelProperty("性别")
    private Integer gender;

//    @ApiModelProperty("密码")
    private String password;

//    @ApiModelProperty("出生日期")
    private Date birthDay;
}
