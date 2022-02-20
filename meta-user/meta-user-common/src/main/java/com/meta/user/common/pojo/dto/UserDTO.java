package com.meta.user.common.pojo.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.meta.user.common.enums.GenderEnum;
import io.swagger.annotations.ApiModelProperty;
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

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("用户名称")
    private String userName;

    @ApiModelProperty("昵称")
    private String nickName;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("性别")
    private GenderEnum gender;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("出生日期")
    private Date birthday;

    @ApiModelProperty("手机")
    private String mobile;

    @ApiModelProperty("邮箱")
    private String email;
}
