package com.wang.demo02;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 王冰炜
 * @create 2021-04-02 15:54
 */
public class UserServiceImplTest{

    @Test
    public void Test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = (UserService) context.getBean("serviceImpl");
        service.add();
        service.delete();
    }

}