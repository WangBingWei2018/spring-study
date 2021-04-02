package com.wang.demo03;

import com.wang.demo03.entity.Person;
import com.wang.demo03.service.UserService;
import com.wang.demo03.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 王冰炜
 * @create 2021-04-02 16:29
 */

public class MyTest {

    @Test
    public void Test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = (UserService) context.getBean("ServiceImpl");
        service.Eat();

    }


}
