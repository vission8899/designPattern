package com.vission.creational.factory;

import com.vission.creational.factory.enums.BrandEnum;
import com.vission.creational.factory.phoneFactory.HuaweiPhoneFactory;
import com.vission.creational.factory.phoneFactory.IphoneFactory;
import com.vission.creational.factory.phoneFactory.PhoneAbstractFactory;

public class PhoneBrandFactory {

    public static PhoneAbstractFactory createFactory(BrandEnum type) {
        switch (type) {
            case APPLE:
                return new IphoneFactory();
            case HUAWEI:
                return new HuaweiPhoneFactory();
            default:
                throw new RuntimeException("暂不支持该品牌");
        }
    }

}
