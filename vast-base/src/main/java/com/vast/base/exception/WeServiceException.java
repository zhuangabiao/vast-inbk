package com.vast.base.exception;

import com.vast.base.enums.ExceptionEnum;
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
public class WeServiceException extends RuntimeException{

    public HttpStatus status = HttpStatus.EXPECTATION_FAILED;

    public WeServiceException() {
        super();
    }

    public WeServiceException(String message) {
        super(message);
    }

    public WeServiceException(Throwable cause) {
        super(cause);
    }

    public WeServiceException(HttpStatus status) {
        this.status = status;
    }
    public WeServiceException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
        this.status = exceptionEnum.getStatus();
    }


    public WeServiceException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }
}
