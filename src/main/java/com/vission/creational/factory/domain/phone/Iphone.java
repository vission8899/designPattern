package com.vission.creational.factory.domain.phone;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Iphone extends Phone {

    /**
     * 果粉
     */
    public void fruitPowder() {
        System.out.println("60帧比120帧流畅");
    }

}
