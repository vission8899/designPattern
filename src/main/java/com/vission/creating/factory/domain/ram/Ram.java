package com.vission.creating.factory.domain.ram;

import com.vission.creating.factory.enums.BrandEnum;
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
