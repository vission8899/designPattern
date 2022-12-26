package com.vission.creational.factory.domain.ram;

import com.vission.creational.factory.enums.BrandEnum;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class Ram {

    //品牌
    private BrandEnum brand;
    //容量
    private int capacity;
    //频率
    private int frequency;

}
