package com.vission.creational.factory.phoneFactory;

import com.vission.creational.factory.cpuFactory.CpuFactory;
import com.vission.creational.factory.domain.cpu.Cpu;
import com.vission.creational.factory.domain.phone.HuaweiPhone;
import com.vission.creational.factory.domain.ram.Ram;
import com.vission.creational.factory.enums.CpuTypeEnum;
import com.vission.creational.factory.enums.PhoneModelEnum;
import com.vission.creational.factory.enums.RamTypeEnum;
import com.vission.creational.factory.ramFactory.RamFactory;
import java.math.BigDecimal;

public class HuaweiPhoneFactory extends PhoneAbstractFactory {

    @Override
    public HuaweiPhone creatPhone(PhoneModelEnum phoneModelEnum) {
        Cpu kirin990 = CpuFactory.createCpu(CpuTypeEnum.KIRIN_990);
        Cpu kirin9000 = CpuFactory.createCpu(CpuTypeEnum.KIRIN_9000);

        Ram ram4 = RamFactory.createRam(RamTypeEnum.RAM_4G);
        Ram ram6 = RamFactory.createRam(RamTypeEnum.RAM_6G);

        HuaweiPhone huaweiPhone;
        switch (phoneModelEnum) {
            case MATE_40:
                huaweiPhone = HuaweiPhone.builder().model(PhoneModelEnum.MATE_40)
                        .price(BigDecimal.valueOf(5999)).ram(ram4).cpu(kirin990).build();
                break;
            case MATE_40_PRO:
                huaweiPhone = HuaweiPhone.builder().model(PhoneModelEnum.MATE_40_PRO)
                        .price(BigDecimal.valueOf(7999)).ram(ram6).cpu(kirin990).build();
                break;
            case MATE_50:
                huaweiPhone = HuaweiPhone.builder().model(PhoneModelEnum.MATE_50)
                        .price(BigDecimal.valueOf(5999)).ram(ram4).cpu(kirin9000).build();
                break;
            case MATE_50_PRO:
                huaweiPhone = HuaweiPhone.builder().model(PhoneModelEnum.MATE_50_PRO)
                        .price(BigDecimal.valueOf(7999)).ram(ram6).cpu(kirin990).build();
                break;
            default:
                huaweiPhone = HuaweiPhone.builder().build();
                break;
        }
        return huaweiPhone;
    }
}
