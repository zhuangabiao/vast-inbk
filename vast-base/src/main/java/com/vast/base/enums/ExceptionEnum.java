package com.vast.base.enums;

import org.springframework.http.HttpStatus;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.enums
 * @ClassName: ExceptionEnum
 * @Author: Administrator
 * @Description: 自定义异常的常量
 * @Date: 2021/1/4 15:59
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
public enum ExceptionEnum {

    //传入的空参数异常
    WE_SERVICE_NOT_ACCEPTABL(HttpStatus.NOT_ACCEPTABLE,"传入参数是空的");
    private HttpStatus status;
    private String msg;

    ExceptionEnum(HttpStatus status,String msg) {
        this.status = status;
        this.msg = msg;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
