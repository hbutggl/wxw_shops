package com.wxw.util;

import lombok.Data;

/**
 * @author HXB
 * @date 2019/6/27
 */
@Data
public class Result {

    public static String SUCCESS = "0000";
    public static String ERROR = "9999";
    public static String ERROR_VALID_EMPTY = "4001";
    public static String ERROR_VALID_CHECK = "4002";

    public static String SUCCESS_MESSAGE = "请求成功";
    public static String ERROR_MESSAGE = "请求失败";
    public static String ERROR_VALID_EMPTY_MESSAGE = "请求参数为空";
    public static String ERROR_VALID_CHECK_MESSAGE = "请求参数验证错误";


    private String code;
    private String message;
    private Object data;

    public Result() {
        this.code = SUCCESS;
        this.code = SUCCESS_MESSAGE;
    }

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(String code, Object data) {
        this.code = code;
        this.message = SUCCESS.equals(code) ? SUCCESS_MESSAGE : ERROR_MESSAGE;
        this.data = data;
    }

    public Result(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
