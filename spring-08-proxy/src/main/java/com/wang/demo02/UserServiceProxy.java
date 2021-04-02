package com.wang.demo02;

public class UserServiceProxy implements UserService {

    UserServiceImpl userService = new UserServiceImpl();

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        debug("增");
        userService.add();
    }

    @Override
    public void delete() {
        debug("删");
        userService.delete();
    }

    @Override
    public void update() {
        debug("改");
        userService.update();
    }

    @Override
    public void select() {
        debug("查");
        userService.select();
    }

    public void debug(String msg) {
        System.out.println("[Debug] 使用了" + msg + "操作");
    }
}
