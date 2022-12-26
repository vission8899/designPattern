package com.vission.structural.adapter.service.impl;


import com.vission.structural.adapter.DemoAdapter1;
import com.vission.structural.adapter.service.DemoService;

public class DemoServiceImpl1 extends DemoAdapter1 implements DemoService {

    @Override
    public void demo() {
        System.out.println("我是一个人畜无害的demo方法");
    }

}
