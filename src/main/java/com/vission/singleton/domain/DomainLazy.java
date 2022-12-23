package com.vission.singleton.domain;

import java.util.Objects;

/**
 * 懒汉式单例模式 Lazy singleton mode
 *
 * @author vission
 */

public class DomainLazy {

    private static DomainLazy singleton;

    private final String name;

    public String getName() {
        return name;
    }

    private DomainLazy(String name) {
        this.name = name;
    }

    public static DomainLazy getDomain() throws InterruptedException {
        if (Objects.isNull(singleton)) {
            synchronized (DomainLazy.class) {
                if (Objects.isNull(singleton)) {
                    Thread.sleep(1000L);
                    singleton = new DomainLazy("懒汉");
                }
            }
        }
        return singleton;
    }
}
