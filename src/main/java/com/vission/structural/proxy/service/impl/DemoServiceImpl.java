package com.vission.structural.proxy.service.impl;

import com.vission.structural.proxy.service.DemoService;

public class DemoServiceImpl implements DemoService {

    @Override
    public void demo() {
        System.out.print("我是一个人畜无害的demo方法");
    }

}
