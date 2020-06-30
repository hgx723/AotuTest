package com.course.testng.MultiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {
    @Test
    public void test1()
    {
        System.out.println("test1方法");
        System.out.printf("test1的Thread Id: %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2()
    {
        System.out.println("test2方法");
        System.out.printf("test2的Thread Id: %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3()
    {
        System.out.println("test3方法");
        System.out.printf("test3的Thread Id: %s%n",Thread.currentThread().getId());
    }
}
