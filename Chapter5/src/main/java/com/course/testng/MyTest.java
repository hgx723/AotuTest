package com.course.testng;

import org.testng.annotations.Test;

public class MyTest {
    @Test
    public void  test(){
        System.out.println("这是我的MyTest用例");
        System.out.printf("Mytest类中的Thread Id: %s%n",Thread.currentThread().getId());
    }
}
