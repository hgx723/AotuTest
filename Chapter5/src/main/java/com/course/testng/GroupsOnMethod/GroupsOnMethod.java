package com.course.testng.GroupsOnMethod;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务器端测试方法1111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务器端测试方法2222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端测试方法3333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端测试方法4444");
    }
    @BeforeGroups("server")
    public void befroreGroupsOnServer(){
        System.out.println("这是服务端方法之前运行的方法！！！！");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端方法之后运行的方法！！！！");
    }
    @BeforeGroups("client")
    public void befroreGroupsOnClient(){
        System.out.println("这是客户端方法之前运行的方法！！！！");
    }
    @AfterGroups("client")
    public void afterGroupsOClient(){
        System.out.println("这是客户端方法之后运行的方法！！！！");
    }
}
