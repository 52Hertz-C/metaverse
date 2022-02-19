package com.meta.user.common.enums;

public enum ResponseEnum {

    /**
     * 对外展示信息
     */
	SUCCESS("200", "成功"),
	ERROR("500", "失败"),
    SYSTEM_IS_BUSY("501", "系统繁忙");

    String code;
    String msg;

    ResponseEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
