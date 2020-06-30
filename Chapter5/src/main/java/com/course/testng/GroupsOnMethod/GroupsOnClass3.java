package com.course.testng.GroupsOnMethod;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3{
    public void teacher1(){
        System.out.println("这是class3中运行的teacher11111方法");
    }
    public void teacher2(){
        System.out.println("这是class3中运行的teacher2222方法");
    }
}
