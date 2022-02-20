package com.meta.user.common.exception;

/**
 * @program: meta-framework
 * @description:
 * @packagename: com.meta.user.common.exception
 * @author: cxy
 * @date: 2022-02-20 17:32:01
 **/
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = -2338814209828437720L;
    protected String errorCode;

    public BusinessException(String msg, Throwable t) {
        super(msg, t);
    }

    public BusinessException(String errorCode, String msg) {
        super(msg);
        this.errorCode = errorCode;
    }

    public BusinessException() {
    }

    public BusinessException(String msg) {
        super(msg);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}

