package com.vission.singleton.domain;


/**
 * 饿汉式单例模式 Hungry man-style singleton mode
 *
 * @author vission
 */

public class DomainHungry {

    private static final DomainHungry singleton;

    private final String name;

    public String getName() {
        return name;
    }

    private DomainHungry(String name) {
        this.name = name;
    }


    static {
        singleton = new DomainHungry("饿汉");
    }

    public static DomainHungry getDomain() {
        return singleton;
    }

}
