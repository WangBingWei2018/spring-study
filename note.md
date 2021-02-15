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
    如果@Autowired不能通过唯一属性自动装配，则需要通过---@Qualifier(value = "cat1")
- @Nullable:标记这个字段可以为null
- @Resource:自动装配--通过名字，类型---@Resource(name = "dog2")
  

- @Component:组建，说明这个类被Spring管理了，即Bean

@Component 的三个衍生注解:为了更好的进行分层，Spring可以使用其它三个注解，功能一样，目前使用哪一个功能都一样。
- @Controller：web层
- @Service：service层
- @Repository：dao层




