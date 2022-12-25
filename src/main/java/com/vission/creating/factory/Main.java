package com.vission.creating.factory;

import com.vission.creating.factory.enums.BrandEnum;
import com.vission.creating.factory.enums.PhoneModelEnum;
import com.vission.creating.factory.phoneFactory.PhoneAbstractFactory;
import com.vission.creating.factory.pojo.cpu.Cpu;
import com.vission.creating.factory.pojo.phone.Iphone;
import com.vission.creating.factory.pojo.phone.Phone;
import com.vission.creating.factory.pojo.ram.Ram;
import java.math.BigDecimal;

public class Main {

    //学习工程模式之前 请先带入 调用方 与服务提供方的场景
    public static void main(String[] args) {
        //没有工厂模式之前的调用 往往还伴随大量复杂的调用文档供阅读
        //创建Iphone11
        //这是每个调用方所需代码量 而这段代码很明显上层服务提供方封装起来会更好 工厂模式就是如此引进的
        Main.create(PhoneModelEnum.IPHONE_11_PRO_MAX);

        //以下是服务提供者使用工厂模式后 每个调用方所需的代码量 高下立判
        BrandEnum brandEnum = BrandEnum.APPLE;
        //brandEnum = BrandEnum.HUAWEI;
        //抽象工厂
        PhoneAbstractFactory phoneFactory = PhoneBrandFactory.createFactory(brandEnum);
        PhoneModelEnum phoneModelEnum = PhoneModelEnum.IPHONE_11_PRO_MAX;
        //phoneModelEnum = PhoneModelEnum.MATE_50_PRO;
        Phone phone = phoneFactory.creatPhone(phoneModelEnum);
        System.out.println(phone);
    }

    /**
     * 调用方所写的代码 创建手机
     *
     * @param modelEnum 手机型号
     * @return Phone
     */
    private static Phone create(PhoneModelEnum modelEnum) {
        //调用方需要了解每个phone所使用的Cpu RAM 浪费大量的时间、精力成本
        //工厂模式 就是指的 服务方提供的SDK抑或是API 将产品所需配件关联封装起来 使得调用方无需关心底层组装实现
        //工厂模式 是服务提供者所使用的一种设计模式 简而言之就是 你作为服务提供方 别人使用你提供的接口更简单
        Phone phone;
        switch (modelEnum) {
            case IPHONE_11:
                phone = Iphone.builder()
                        .model(PhoneModelEnum.IPHONE_11)
                        .ram(Ram.builder().brand(BrandEnum.INTEL).build())
                        .cpu(Cpu.builder().brand(BrandEnum.INTEL).coreNum(1).threadNum(3).frequency(3).build())
                        .price(BigDecimal.valueOf(5000))
                        .build();
                break;
            case IPHONE_11_PRO:
            case IPHONE_11_PRO_MAX:
            case IPHONE_XS:
            case IPHONE_XS_MAX:
            case MATE_40:
            case MATE_40_PRO:
            case MATE_50:
            case MATE_50_PRO:
            default:
                //不详细展开写了 可以看出会是很长一段的冗余代码
                phone = Phone.builder().build();
                break;

        }

        return phone;


    }
}
