package com.vission.creational.factory.ramFactory;

import com.vission.creational.factory.domain.ram.Ram;
import com.vission.creational.factory.enums.BrandEnum;
import com.vission.creational.factory.enums.RamTypeEnum;

public class RamFactory {

    public static Ram createRam(RamTypeEnum ramTypeEnum) {
        switch (ramTypeEnum) {
            case RAM_3G:
                return Ram.builder().brand(BrandEnum.INTEL).capacity(3).frequency(1600).build();
            case RAM_4G:
                return Ram.builder().brand(BrandEnum.INTEL).capacity(4).frequency(1600).build();
            case RAM_6G:
                return Ram.builder().brand(BrandEnum.INTEL).capacity(6).frequency(1600).build();
            case RAM_8G:
                return Ram.builder().brand(BrandEnum.INTEL).capacity(8).frequency(1600).build();
            case RAM_16G:
                return Ram.builder().brand(BrandEnum.INTEL).capacity(16).frequency(1600).build();
            default:
                return Ram.builder().build();
        }
    }
}
