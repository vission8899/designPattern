package com.vission.creating.factory;

import com.vission.creating.factory.enums.BrandEnum;
import com.vission.creating.factory.phoneFactory.HuaweiPhoneFactory;
import com.vission.creating.factory.phoneFactory.IphoneFactory;
import com.vission.creating.factory.phoneFactory.PhoneAbstractFactory;

public class PhoneBrandFactory {

    public static PhoneAbstractFactory createFactory(BrandEnum type) {
        switch (type) {
            case APPLE:
                return new IphoneFactory();
            case HUAWEI:
                return new HuaweiPhoneFactory();
            default:
                return null;
        }
    }

}
