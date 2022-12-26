package com.vission.creating.prototype.domain;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 人 实现Cloneable接口 重写clone方法【实际是调用Object的native方法】
 */
@Getter
@Setter
@ToString
//@Data 使用data会重写equals、hashCode 这里的实验不需要
public class Person implements Cloneable, Serializable {

    private static final long serialVersionUID = 4982206063131788088L;

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

}
