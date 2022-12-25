package com.vission.creating.factory.pojo.ram;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class Ram {

    //品牌
    private String brand;
    //容量
    private int capacity;
    //频率
    private int frequency;

}
