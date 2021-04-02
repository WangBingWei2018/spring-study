package com.wang.demo02;

/**
 * @author 王冰炜
 * @create 2021-04-02 15:21
 */
public class MyAspect {
    public void before(){
        System.out.println("---------方法执行前---------");
    }
    public void after(){
        System.out.println("---------方法执行后---------");
    }
}
