package com.leyou.common.enums;

/**
 * @author ShangyiChen
 * @date 2020/3/23 12:46
 **/
public enum ExceptionEnum {
    PRICE_CANNOT_BE_NULL(400,"价格不能为空!"),
    CATEGORY_NOT_FOUND(404,"无商品分类信息")
    ;
    private int code;
    private String msg;

    ExceptionEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    ExceptionEnum() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
