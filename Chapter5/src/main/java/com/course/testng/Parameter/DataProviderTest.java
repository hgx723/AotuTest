package com.course.testng.Parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProviders(String name,int age){
        System.out.println("name:"+name+";age:"+age);
    }
    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        Object[][] o=new Object[][]{
                {"zhangsan",10},
                {"lisi",15},
                {"wangwu",20}
        };
        return o;
    }
    @DataProvider(name="methodData")
    public  Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("methodTest1")) {
            result = new Object[][]{
                    {"zhangsan", 20},
                    {"lisi", 25}
            };
        } else if (method.getName().equals("methodTest2")) {
            result = new Object[][]{
                    {"wangwu", 30},
                    {"zhaoliu", 35}
            };
        } else {
            result = new Object[][]{
                    {"xiaonai", 23},
                    {"yutu", 27}
            };
        }
        return result;
    }
    @Test(dataProvider= "methodData")
    public void methodTest1(String name,int age){
        System.out.println("方法111的name:"+name+";age:"+age);
    }
    @Test(dataProvider = "methodData")
    public void methodTest2(String name,int age){
        System.out.println("方法222的name:"+name+";age:"+age);
    }
    @Test(dataProvider = "methodData")
    public void methodTest3(String name,int age){
        System.out.println("方法333的name:"+name+";age:"+age);
    }
    }
