package com.vission.structural.flyweight;

import com.google.common.collect.Maps;
import com.vission.structural.flyweight.domain.Cat;
import com.vission.structural.flyweight.enums.ColorEnum;
import java.util.Map;

/**
 * 享元模式
 *
 * @author vission
 */
public class Main {

    private static final Map<ColorEnum, Cat> map = Maps.newHashMap();

    public static void main(String[] args) {
        ColorEnum colorEnum = ColorEnum.BLACK;
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Cat cat = Main.findCat(colorEnum);
//                Cat cat = Main.findCat1(colorEnum);
                System.out.println(cat + ":" + cat.hashCode());
            }).start();

        }
    }

    /**
     * 找猫
     *
     * @param colorEnum 颜色
     * @return 猫
     */
    public static Cat findCat(ColorEnum colorEnum) {
        if (!Main.map.containsKey(colorEnum)) {
            synchronized (Main.class) {
                if (!Main.map.containsKey(colorEnum)) {
                    Main.map.put(colorEnum, new Cat(colorEnum));
                }
            }
        }
        return Main.map.get(colorEnum);
    }

    /**
     * 找猫 线程不安全反例
     *
     * @param colorEnum 颜色
     * @return 猫
     */
    public static Cat findCat1(ColorEnum colorEnum) {
        if (!Main.map.containsKey(colorEnum)) {
            Main.map.put(colorEnum, new Cat(colorEnum));
        }
        return Main.map.get(colorEnum);
    }
}
