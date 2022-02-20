package com.meta.user.common.enums.code;

import com.meta.user.common.exception.BusinessException;

/**
 * { DESCRIBE HERE }
 *
 * @author zhouwei
 * @since 2022/1/13
 */
public enum UserResponseCode {

    USER_NOT_EXISTS("user_not_exists_101", "用户不存在"),
    USER_PARAMS_ERROR("user_params_error_102", "用户参数错误");
    ;

    UserResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private final String code;

    private final String message;



    public BusinessException genException() {
        return new BusinessException(this.code, this.message);
    }

    public BusinessException genException(String message) {
        return new BusinessException(this.code, message);
    }
}
