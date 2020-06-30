package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    //这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExceptionSucess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();

    }

}
