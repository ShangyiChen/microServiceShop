package com.leyou.common.advice.exception;

import com.leyou.common.enums.ExceptionEnum;

/**
 * @author ShangyiChen
 * @date 2020/3/23 12:45
 **/

public class LyException extends RuntimeException {
    private ExceptionEnum exceptionEnum;

    public LyException(){
    }
    public LyException(ExceptionEnum exceptionEnum){
        this.exceptionEnum = exceptionEnum;
    }

    public ExceptionEnum getExceptionEnum() {
        return exceptionEnum;
    }
}
