package com.vission.creating.prototype.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 猫 实现Cloneable接口 重写clone方法【实际是调用Object的native方法】
 *
 * @author vission
 */
@Getter
@Setter
@ToString
//@Data 使用data会重写equals、hashCode 这里的实验不需要
public class Cat implements Cloneable {

    private String name;

    private int age;

    private Person master;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Cat clone() throws CloneNotSupportedException {
        Cat catClone = (Cat) super.clone();
        Person masterClone = catClone.getMaster().clone();
        catClone.setMaster(masterClone);
        return catClone;
    }
}
