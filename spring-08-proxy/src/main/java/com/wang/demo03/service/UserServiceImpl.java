package com.wang.demo03.service;


import com.wang.demo03.entity.Person;
import lombok.AllArgsConstructor;

/**
 * @author 王冰炜
 * @create 2021-04-02 16:23
 */
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    Person person;

    @Override
    public void Eat() {
        person.Say();
        System.out.println("不吃肉不能活~");
    }
}
