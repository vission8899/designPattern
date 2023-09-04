package com.vission.behavioral.template.impl;

import com.vission.behavioral.template.DemoAbstractTemsplate;

public class DemoTemplateImpl extends DemoAbstractTemsplate {

    @Override
    public void init() {
        System.out.println("重写的初始化");
    }

    @Override
    public void function() {
        System.out.println("业务处理");
    }

    @Override
    public void destroyed() {
        System.out.println("重写的销毁");
    }
}
