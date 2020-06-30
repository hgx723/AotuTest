package com.course.testng.GroupsOnMethod;

import org.testng.annotations.Test;

@Test(groups ="stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("这是class1中运行的stu11111方法");
    }
    public void stu2(){
        System.out.println("这是class1中运行的stu2222方法");
    }
}
