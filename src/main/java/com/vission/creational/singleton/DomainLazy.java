package com.vission.creational.singleton;

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
        if (Objects.isNull(DomainLazy.singleton)) {
            synchronized (DomainLazy.class) {
                if (Objects.isNull(DomainLazy.singleton)) {
                    Thread.sleep(1000L);
                    DomainLazy.singleton = new DomainLazy("懒汉");
                }
            }
        }
        return DomainLazy.singleton;
    }
}
