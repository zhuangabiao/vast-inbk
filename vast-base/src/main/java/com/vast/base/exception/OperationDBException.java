package com.vast.base.exception;

import org.springframework.http.HttpStatus;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.exception
 * @ClassName: OperationDBException
 * @Author: Administrator
 * @Description: 操作数据库异常
 * @Date: 2021/1/4 15:49
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
public class OperationDBException extends RuntimeException{

    public HttpStatus status = HttpStatus.EXPECTATION_FAILED;

    public OperationDBException() {
        super();
    }

    public OperationDBException(String message) {
        super(message);
    }

    public OperationDBException(Throwable cause) {
        super(cause);
    }

    public OperationDBException(HttpStatus status) {
        this.status = status;
    }

    public OperationDBException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }
}
