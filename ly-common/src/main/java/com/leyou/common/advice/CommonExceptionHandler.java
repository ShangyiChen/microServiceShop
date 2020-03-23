package com.leyou.common.advice;

import com.leyou.common.advice.exception.LyException;
import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.vo.ExceptionResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author ShangyiChen
 * @date 2020/3/23 12:34
 **/
@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(LyException.class)
    public ResponseEntity<ExceptionResult> handleException(LyException e){
        ExceptionEnum em = e.getExceptionEnum();
        return ResponseEntity.status(em.getCode()).body(new ExceptionResult(em));
    }
}
