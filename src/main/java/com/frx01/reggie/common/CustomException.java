package com.frx01.reggie.common;

/**
 * @author frx
 * @version 1.0
 * @date 2022/5/8  23:19
 */
public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
