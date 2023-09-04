package com.vission.behavioral.template;

import com.vission.behavioral.template.impl.DemoTemplateImpl;

/**
 * 模板方法模式
 *
 * @author vission
 */
public class Main {

    public static void main(String[] args) {
        DemoAbstractTemsplate template = new DemoTemplateImpl();
        template.templateMethod();
    }
}
