package com.git.rjc.exception;

/**
 * @program: rjc
 * @description: 自定位异常类父类
 * @author: R红茶
 * @create: 2020-01-31 20:00
 **/
public class ServiceException extends RuntimeException{
    public ServiceException() {
    }

    public ServiceException(String msg) {
        super(msg);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
