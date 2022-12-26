package com.vission.creational.factory.phoneFactory;

import com.vission.creational.factory.cpuFactory.CpuFactory;
import com.vission.creational.factory.domain.cpu.Cpu;
import com.vission.creational.factory.domain.phone.Iphone;
import com.vission.creational.factory.domain.ram.Ram;
import com.vission.creational.factory.enums.CpuTypeEnum;
import com.vission.creational.factory.enums.PhoneModelEnum;
import com.vission.creational.factory.enums.RamTypeEnum;
import com.vission.creational.factory.ramFactory.RamFactory;
import java.math.BigDecimal;

public class IphoneFactory extends PhoneAbstractFactory {

    @Override
    public Iphone creatPhone(PhoneModelEnum phoneModelEnum) {
        Iphone iphone;
        Cpu a13 = CpuFactory.createCpu(CpuTypeEnum.A13);
        Cpu a12 = CpuFactory.createCpu(CpuTypeEnum.A12);

        Ram ram3 = RamFactory.createRam(RamTypeEnum.RAM_3G);
        Ram ram4 = RamFactory.createRam(RamTypeEnum.RAM_4G);
        Ram ram6 = RamFactory.createRam(RamTypeEnum.RAM_6G);

        switch (phoneModelEnum) {
            case IPHONE_11:
                iphone = Iphone.builder().model(PhoneModelEnum.IPHONE_11)
                        .price(BigDecimal.valueOf(5999)).ram(ram4).cpu(a13).build();
                break;
            case IPHONE_11_PRO:
                iphone = Iphone.builder().model(PhoneModelEnum.IPHONE_11_PRO)
                        .price(BigDecimal.valueOf(7999)).ram(ram4).cpu(a13).build();
                break;
            case IPHONE_11_PRO_MAX:
                iphone = Iphone.builder().model(PhoneModelEnum.IPHONE_11_PRO_MAX)
                        .price(BigDecimal.valueOf(9999)).ram(ram6).cpu(a13).build();
                break;
            case IPHONE_XS:
                iphone = Iphone.builder().model(PhoneModelEnum.IPHONE_XS)
                        .price(BigDecimal.valueOf(5999)).ram(ram3).cpu(a12).build();
                break;
            case IPHONE_XS_MAX:
                iphone = Iphone.builder().model(PhoneModelEnum.IPHONE_XS_MAX)
                        .price(BigDecimal.valueOf(7999)).ram(ram3).cpu(a12).build();
                break;
            default:
                iphone = Iphone.builder().build();
                break;
        }
        return iphone;
    }
}
