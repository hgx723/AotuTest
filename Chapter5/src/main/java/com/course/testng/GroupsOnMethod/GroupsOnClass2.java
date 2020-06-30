package com.course.testng.GroupsOnMethod;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("这是class2中运行的stu11方法");
    }
    public void stu2(){
        System.out.println("这是class2中运行的stu22方法");
    }
}
