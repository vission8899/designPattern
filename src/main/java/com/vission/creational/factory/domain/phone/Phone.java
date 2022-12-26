package com.vission.creational.factory.domain.phone;

import com.vission.creational.factory.domain.cpu.Cpu;
import com.vission.creational.factory.domain.ram.Ram;
import com.vission.creational.factory.enums.PhoneModelEnum;
import java.math.BigDecimal;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class Phone {

    //价格
    private BigDecimal price;
    //内存
    private Ram ram;
    //cpu
    private Cpu cpu;
    //型号
    private PhoneModelEnum model;
}
