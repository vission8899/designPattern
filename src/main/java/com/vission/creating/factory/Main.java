package com.vission.creating.factory;

import com.vission.creating.factory.enums.BrandEnum;
import com.vission.creating.factory.enums.PhoneModelEnum;
import com.vission.creating.factory.phoneFactory.PhoneAbstractFactory;
import com.vission.creating.factory.pojo.phone.HuaweiPhone;
import com.vission.creating.factory.pojo.phone.Iphone;
import com.vission.creating.factory.pojo.phone.Phone;

public class Main {


    public static void main(String[] args) {
        //苹果
        BrandEnum brandEnum = BrandEnum.APPLE;
//        brandEnum = BrandEnum.HUAWEI;
        //抽象工厂
        PhoneAbstractFactory phoneFactory = PhoneBrandFactory.createFactory(brandEnum);
        PhoneModelEnum phoneModelEnum = PhoneModelEnum.IPHONE_11_PRO_MAX;
        //phoneModelEnum = PhoneModelEnum.MATE_50_PRO;
        Phone phone = phoneFactory.creatPhone(phoneModelEnum);
        System.out.println(phone);
        switch (brandEnum) {
            case APPLE:
                Iphone iphone = (Iphone) phone;
                iphone.fruitPowder();
                break;
            case HUAWEI:
                HuaweiPhone huaweiPhone = (HuaweiPhone) phone;
                huaweiPhone.navy();
                break;
            default:
                break;
        }
    }
}
