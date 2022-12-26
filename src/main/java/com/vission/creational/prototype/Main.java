package com.vission.creational.prototype;

import com.vission.creational.prototype.domain.Cat;
import com.vission.creational.prototype.domain.Dog;
import com.vission.creational.prototype.domain.Person;
import com.vission.creational.prototype.utils.BeanUtil;
import java.io.IOException;

/**
 * 原型模式
 *
 * @author vission
 */
public class Main {

    //浅拷贝 Flyweight Pattern 结构型模式
    //cloneable 并没有 FastJson 通过序列化的clone方法好用 但是cloneable是java自带的
    public static void main(String[] args)
            throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //cloneable 浅拷贝
        System.out.println("执行拷贝");
        Cat cat = new Cat("小花", 2);
        Person master = new Person("小明", 20);
        cat.setMaster(master);
        Cat cloneCat = BeanUtil.shallowCopy(cat);
        System.out.println("cat         : " + cat);
        System.out.println("clone:      " + cloneCat);
        System.out.println("cat.master  : " + cat.getMaster().hashCode());
        System.out.println("clone.master: " + cloneCat.getMaster().hashCode());
        // 对于person来说，是浅拷贝，只是拷贝了值、对于引用对象仅仅是拷贝了 对象的值【地址】 也就是说，两个对象的引用对象是同一个
        //子类Person也实现了Cloneable接口，所以也可以被克隆
        System.out.println("子类Person也实现了Cloneable接口子类Person也实现了Cloneable接口");
        cat.getMaster().setName("小红");
        cat.getMaster().setAge(21);
        System.out.println("cat         : " + cat);
        System.out.println("clone       :" + cloneCat);
        System.out.println("cat.master  : " + cat.getMaster().hashCode());
        System.out.println("clone.master: " + cloneCat.getMaster().hashCode());
        //深拷贝
        Dog dog = new Dog("小花", 2, new Person("小明", 20));
        Dog cloneDog = BeanUtil.deepCopy(dog);
        dog.getMaster().setName("小红");
        dog.getMaster().setAge(21);
        System.out.println("dog            : " + dog);
        System.out.println("cloneDog       : " + cloneDog);
        System.out.println("dog.master     : " + dog.getMaster().hashCode());
        System.out.println("cloneDog.master: " + cloneDog.getMaster().hashCode());
    }
}
