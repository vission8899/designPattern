package com.vission.creating.factory.pojo.cpu;

import com.vission.creating.factory.enums.BrandEnum;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Cpu {

    //品牌
    private BrandEnum brand;
    //核心数
    private int coreNum;
    //线程数
    private int threadNum;
    //主频
    private int frequency;

}
