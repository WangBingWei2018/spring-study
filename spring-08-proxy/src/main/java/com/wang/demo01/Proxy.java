package com.wang.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        getMoney();
    }

    public void seeHouse(){
        System.out.println("中介看房");
    }

    public void getMoney(){
        System.out.println("中介收费");
    }
}
