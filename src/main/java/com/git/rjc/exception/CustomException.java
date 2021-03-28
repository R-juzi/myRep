package com.git.rjc.exception;

/**
 * @program: rjc
 * @description: 自定位异常类父类
 * @author: R红茶
 * @create: 2020-01-31 20:00
 **/
public class CustomException extends RuntimeException{
    public CustomException() {
    }

    public CustomException(String msg) {
        super(msg);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }

    public CustomException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
