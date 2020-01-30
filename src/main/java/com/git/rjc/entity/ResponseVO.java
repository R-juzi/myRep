package com.git.rjc.entity;

/**
 * @program: rjc
 * @description: 此项目服务器端的统一响应
 * @author: R红茶
 * @create: 2020-01-30 16:08
 **/
public class ResponseVO<T> {
    private String code;
    private String message;
    private T data;

    public ResponseVO(){

    }
    public ResponseVO(String code,String message){
        this.code=code;
        this.message=message;
    }
    public ResponseVO(String code,String message,T data){
        this.code=code;
        this.message=message;
        this.data=data;
    }
    public static final ResponseVO SUC=new ResponseVO("200","成功");
    public static final ResponseVO NOTFOUND=new ResponseVO("404","NOTFOUND");
    public static final ResponseVO ERROR=new ResponseVO("500","ERROR");

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
