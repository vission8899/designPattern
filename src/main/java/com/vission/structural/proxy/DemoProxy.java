package com.vission.structural.proxy;

import com.vission.structural.proxy.service.DemoService;
import com.vission.structural.proxy.service.impl.DemoServiceImpl;

public class DemoProxy implements DemoService {

    DemoService demoService = new DemoServiceImpl();

    @Override
    public void demo() {
        System.out.print("before--增强业务区域--");
        demoService.demo();
        System.out.print("--after--增强业务区域");
    }
}
