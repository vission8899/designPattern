package com.vission.behavioral.strategy;

import com.google.common.collect.Lists;
import com.vission.behavioral.strategy.collection.CollectionUtils;
import com.vission.behavioral.strategy.domain.Cat;
import com.vission.behavioral.strategy.domain.Dog;
import com.vission.behavioral.strategy.sort.SortUtils;
import com.vission.behavioral.strategy.sort.comparableStartegy.impl.CatHeightStrategy;
import com.vission.behavioral.strategy.sort.comparableStartegy.impl.CatWeightStrategy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Dog[] dogs = {
                Dog.builder().height(3).weight(6).build(),
                Dog.builder().height(4).weight(1).build(),
                Dog.builder().height(2).weight(5).build(),
                Dog.builder().height(5).weight(2).build(),
                Dog.builder().height(1).weight(4).build(),
                Dog.builder().height(6).weight(3).build()
        };
        //利用多态的特性 实现Comparable 可以使用Collections.bubblingSort()方法 也可以使用Arrays.bubblingSort()方法 抑或是自己封装的排序方法
        //但是该方案有个弊端 例如Cat没有实现Comparable接口 则无法使用该方案 可以将Cat理解为无法修改代码的第三方类 无法修改代码的第三方类是无法使用该方案的
        //同样为了遵循开闭原则 也不应该修改Cat类的代码 通过策略模式解耦可以解决该问题
        ArrayList<Dog> dogList = Lists.newArrayList(dogs);
        Collections.sort(dogList);
        dogList.forEach(System.out::println);
        Arrays.sort(dogs);
        //自己封装的CollectionUtils工具类
        CollectionUtils.sort(dogs);
        Arrays.stream(dogs).forEach(System.out::println);

        //通过Comparator实现策略模式 与上述方案相比 策略模式解耦Cat与排序的策略 遵循了开闭原则
        Cat[] cats = {
                Cat.builder().height(3).weight(6).build(),
                Cat.builder().height(4).weight(1).build(),
                Cat.builder().height(2).weight(5).build(),
                Cat.builder().height(5).weight(2).build(),
                Cat.builder().height(1).weight(4).build(),
                Cat.builder().height(6).weight(3).build()
        };
        //按照重量排序
        SortUtils.bubblingSort(cats, new CatWeightStrategy());
        //按照高度排序
        SortUtils.bubblingSort(cats, new CatHeightStrategy());
        //Lambda策略
        SortUtils.bubblingSort(cats, (o1, o2) -> 0);
        Arrays.stream(cats).map(Cat::toString).forEach(System.out::println);

    }
}