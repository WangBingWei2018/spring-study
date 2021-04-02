package com.wang.demo03.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 王冰炜
 * @create 2021-04-02 16:19
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private Integer age;

    public void Say()
    {
        System.out.println("我叫" + name + ",今年" + age + "岁，现在我饿了！！");
    }
}
