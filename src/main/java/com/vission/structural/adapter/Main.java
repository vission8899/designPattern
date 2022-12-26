package com.vission.structural.adapter;

import com.vission.structural.adapter.domain.impl.DonaldDuck;
import com.vission.structural.adapter.service.DemoService;
import com.vission.structural.adapter.service.impl.DemoServiceImpl;
import com.vission.structural.adapter.service.impl.DemoServiceImpl1;

/**
 * 适配器模式
 *
 * @author vission
 */
public class Main {

    /**
     * 适配器模式的核心是适配器，适配器是一个转换器，通过适配器将一个类的接口转换成客户希望的另外一个接口表示，
     */
    public static void main(String[] args) {
        //默认适配器
        DemoService demoService = new DemoServiceImpl();
        demoService.demo();
        //对象适配器
        DuckAdapter chicken = new DuckAdapter(new DonaldDuck());
        chicken.gobble();
        //类适配器 通过继承实现
        DemoService demoService1 = new DemoServiceImpl1();
        demoService1.demo2();
    }

}