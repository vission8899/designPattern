package com.vission.structural.proxy;

import com.vission.structural.proxy.service.DemoService;
import com.vission.structural.proxy.service.impl.DemoServiceImpl;

/**
 * 代理模式
 *
 * @author vission
 */
public class Main {

    public static void main(String[] args) {
        DemoService demoService = new DemoServiceImpl();
        demoService.demo();
        System.out.println();
        //Spring中AOP 基于接口 采用JDK动态代理 基于类 采用CGLIB动态代理
        //无侵入增强demoServiceImpl中的方法 AOP就是通过代理实现
        DemoService demoProxy = new DemoProxy();
        demoProxy.demo();
    }
}
