package com.vission.creating.factory.phoneFactory;

import com.vission.creating.factory.enums.PhoneModelEnum;
import com.vission.creating.factory.pojo.phone.Phone;

/**
 * 抽象工厂
 *
 * @author vission
 */
public abstract class PhoneAbstractFactory {

    /**
     * 创建手机
     *
     * @param phoneModelEnum 手机型号
     * @return 手机
     */
    public abstract Phone creatPhone(PhoneModelEnum phoneModelEnum);

}
