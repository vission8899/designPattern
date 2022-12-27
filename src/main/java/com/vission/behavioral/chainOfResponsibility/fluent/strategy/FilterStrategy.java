package com.vission.behavioral.chainOfResponsibility.fluent.strategy;

import com.vission.behavioral.chainOfResponsibility.fluent.handle.Processor;
import com.vission.behavioral.chainOfResponsibility.fluent.handle.impl.FirstProcessor;
import com.vission.behavioral.chainOfResponsibility.fluent.handle.impl.SecondProcessor;
import com.vission.behavioral.chainOfResponsibility.fluent.handle.impl.ThirdProcessor;
import java.util.LinkedList;

/**
 * 顺序执行策略
 *
 * @author vission
 */
public class FilterStrategy extends Strategy {


    @Override
    public LinkedList<Processor> buildProcessor() {
        processors.add(new FirstProcessor());
        processors.add(new SecondProcessor());
        processors.add(new ThirdProcessor());
        return processors;
    }

}
