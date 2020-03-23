package com.leyou.common.vo;

import com.leyou.common.enums.ExceptionEnum;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * @author ShangyiChen
 * @date 2020/3/23 12:55
 **/

public class ExceptionResult {
    private int status;
    private String message;
    private String timestamp;

    public ExceptionResult(ExceptionEnum em){
        this.status = em.getCode();
        this.message = em.getMsg();
        this.timestamp = formatTimestamp();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public static String formatTimestamp(){
        long timestamp = System.currentTimeMillis();
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//将毫秒级long值转换成日期格式

        GregorianCalendar gc = new GregorianCalendar();

        gc.setTimeInMillis(timestamp);

        String dateStr = dateformat.format(gc.getTime());

        return  dateStr;

    }


}
