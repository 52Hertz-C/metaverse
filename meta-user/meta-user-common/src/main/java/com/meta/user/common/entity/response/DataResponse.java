package com.meta.user.common.entity.response;

import com.meta.user.common.enums.ResponseEnum;

import java.io.Serializable;

/**
 *  请求信息
 */
public class DataResponse<T> implements Serializable {
    private String code = ResponseEnum.SUCCESS.getCode();
    private String msg = ResponseEnum.SUCCESS.getMsg();
    private T data;

    public static <T> DataResponse<T> success() {
        DataResponse<T> resp = new DataResponse<T>();
        resp.setCode(ResponseEnum.SUCCESS.getCode());
        resp.setMsg(ResponseEnum.SUCCESS.getMsg());
        return resp;
    }

    public static <T> DataResponse<T> success(T data) {
        DataResponse<T> resp = new DataResponse<T>();
        resp.setCode(ResponseEnum.SUCCESS.getCode());
        resp.setMsg(ResponseEnum.SUCCESS.getMsg());
        resp.setData(data);
        return resp;
    }

    public static <T> DataResponse<T> fail(String msg) {
        DataResponse<T> resp = new DataResponse<T>();
        resp.setCode(ResponseEnum.ERROR.getCode());
        resp.setMsg(msg);
        return resp;
    }

    public static <T> DataResponse<T> fail(ResponseEnum responseCode) {
        DataResponse<T> resp = new DataResponse<T>();
        resp.setCode(responseCode.getCode());
        resp.setMsg(responseCode.getMsg());
        return resp;
    }

    public static <T> DataResponse<T> fail(String code, String msg) {
        DataResponse<T> resp = new DataResponse<T>();
        resp.setCode(code);
        resp.setMsg(msg);
        return resp;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
