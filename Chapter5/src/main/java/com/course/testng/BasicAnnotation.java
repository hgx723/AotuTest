package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法作为测试的一部分
    @Test
    public void testCase1()
    {
     System.out.print("这是测试用例1");
        System.out.printf("testCase1的Thread id： %s%n",Thread.currentThread().getId());
    }
    @Test
    public void  testCase2(){
        System.out.println("这是用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod这是方法之前运行的");
    }
    @AfterMethod
    public void  afterMethod(){
        System.out.println("afterMethod这是方法之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("这是在类运行之前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("这是在类运行之后运行的方法");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite套件");
    }
}
