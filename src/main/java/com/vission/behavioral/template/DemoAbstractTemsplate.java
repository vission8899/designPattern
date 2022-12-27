package com.vission.behavioral.template;

public abstract class DemoAbstractTemsplate {

    public void templateMethod() {
        init();
        function();
        destroyed();
    }

    /**
     * 初始化
     */
    public void init() {
        System.out.println("初始化");
    }

    public void function() {
        System.out.println("执行业务代码");
    }

    /**
     * 销毁
     */
    public void destroyed() {
        System.out.println("销毁资源");
    }

}
