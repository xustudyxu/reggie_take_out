package com.frx01.reggie.text;

import org.junit.Test;

/**
 * @author frx
 * @version 1.0
 * @date 2022/5/6  21:54
 */
public class UploadFileTest {

    @Test
    public void test1(){
        String fileName="ererewe.jpg";
        String suffix=fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);

    }
}
