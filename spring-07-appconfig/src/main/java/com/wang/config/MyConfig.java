package com.wang.config;

import com.wang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration//也会被Spring容器托管，其本身就是一个组件@Component，@Configuration代表这是一个配置类，即这是一个beans.xml
@ComponentScan("com.wang.pojo")
@Import(MyConfig2.class)
public class MyConfig {
    //注册一个Bean，相当于之前写的一个bean标签
    //方法名=id属性
    //方法返回值=class属性
    @Bean
    public User getUser(){
        return new User();//返回要注入到Bean的对象
    }
}
