## 常用依赖
```xml
    <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.0.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
    </dependencies>
```

## 注解说明
- @Autowired:自动装配--通过类型，名字
    如果@Autowired不能通过唯一属性自动装配，则需要通过@Qualifier(value = "XXX")
- @Nullable:标记这个字段可以为null
- @Resource:自动装配--通过名字，类型
