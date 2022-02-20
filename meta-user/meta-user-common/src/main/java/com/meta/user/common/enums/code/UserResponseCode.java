package com.meta.user.common.enums.code;

import com.qiaofang.common.exception.BusinessException;

/**
 * { DESCRIBE HERE }
 *
 * @author zhouwei
 * @since 2022/1/13
 */
public enum UserResponseCode {

    LOCAL_ROOM_NOT_EXISTS("loupan_local_room_not_exists", "房号不存在"),


    ROOM_SQUARE_BUILDING_MUST_GT_INTERNAL("LOUPAN_ROOM_SQUARE_BUILDING_MUST_GT_INTERNAL", "建筑面积必须大于等于套内面积");
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
