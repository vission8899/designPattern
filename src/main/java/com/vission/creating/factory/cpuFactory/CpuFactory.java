package com.vission.creating.factory.cpuFactory;

import com.vission.creating.factory.domain.cpu.Cpu;
import com.vission.creating.factory.enums.BrandEnum;
import com.vission.creating.factory.enums.CpuTypeEnum;

public class CpuFactory {

    /**
     * 获取cpu 简单工厂
     *
     * @param cpuTypeEnum cpu型号
     * @return cpu
     */
    public static Cpu createCpu(CpuTypeEnum cpuTypeEnum) {
        switch (cpuTypeEnum) {
            case A12:
                return Cpu.builder().brand(BrandEnum.APPLE).coreNum(6).threadNum(12).frequency(2).build();
            case A13:
                return Cpu.builder().brand(BrandEnum.APPLE).coreNum(8).threadNum(8).frequency(2).build();
            case A14:
                return Cpu.builder().brand(BrandEnum.APPLE).coreNum(8).threadNum(8).frequency(3).build();
            case A15:
                return Cpu.builder().brand(BrandEnum.APPLE).coreNum(8).threadNum(8).frequency(4).build();
            case KIRIN_990:
                return Cpu.builder().brand(BrandEnum.KIRIN).coreNum(8).threadNum(8).frequency(2).build();
            case KIRIN_9000:
                return Cpu.builder().brand(BrandEnum.KIRIN).coreNum(8).threadNum(8).frequency(3).build();
            default:
                return Cpu.builder().build();
        }
    }

}
