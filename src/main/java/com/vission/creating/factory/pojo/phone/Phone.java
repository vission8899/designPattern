package com.vission.creating.factory.pojo.phone;

import com.vission.creating.factory.enums.PhoneModelEnum;
import com.vission.creating.factory.pojo.cpu.Cpu;
import com.vission.creating.factory.pojo.ram.Ram;
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
