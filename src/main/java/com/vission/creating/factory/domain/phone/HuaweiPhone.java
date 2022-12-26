package com.vission.creating.factory.domain.phone;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class HuaweiPhone extends Phone {

    /**
     * 海军
     */
    public void navy() {
        System.out.println("4g比5g快");

    }
}
