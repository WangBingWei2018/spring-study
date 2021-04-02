package com.wang.demo03.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author 王冰炜
 * @create 2021-04-02 16:25
 */
@Aspect
public class MyAspect
{

    @Pointcut("bean(ServiceImpl)")
    public void domain(){}

    @Before("domain()")
    public void doBefore(){
        System.out.println("--进入厕所--");
    }

    @After("domain()")
    public void doAfter(){
        System.out.println("--心满意足地离开厕所--");
    }

    @Around("domain()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        System.out.println("签名:"+jp.getSignature());
        //执行目标方法proceed
        Object proceed = jp.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }


//    @Before("execution(* com.wang.demo03.service.UserServiceImpl.*(..))")
//    public void before(){
//        System.out.println("---------方法执行前---------");
//    }
//
//    @After("execution(* com.wang.demo03.service.UserServiceImpl.*(..))")
//    public void after(){
//        System.out.println("---------方法执行后---------");
//    }
//
//    @Around("execution(* com.wang.demo03.service.UserServiceImpl.*(..))")
//    public void around(ProceedingJoinPoint jp) throws Throwable {
//        System.out.println("环绕前");
//        System.out.println("签名:"+jp.getSignature());
//        //执行目标方法proceed
//        Object proceed = jp.proceed();
//        System.out.println("环绕后");
//        System.out.println(proceed);
//    }
}
