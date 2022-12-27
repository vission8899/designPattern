package com.vission.behavioral.chainOfResponsibility.fluent.strategy;

import com.vission.behavioral.chainOfResponsibility.fluent.context.FilterProcessorContext;
import com.vission.behavioral.chainOfResponsibility.fluent.handle.Processor;
import com.vission.behavioral.chainOfResponsibility.fluent.handle.impl.FirstProcessor;
import com.vission.behavioral.chainOfResponsibility.fluent.handle.impl.SecondProcessor;
import com.vission.behavioral.chainOfResponsibility.fluent.handle.impl.ThirdProcessor;
import java.util.LinkedList;

/**
 * 执行顺序策略
 *
 * @author vission
 */
public class FilterOrderStrategy extends Strategy<FilterProcessorContext> {


    @Override
    public LinkedList<Processor<FilterProcessorContext>> buildProcessor() {
        processors.add(new FirstProcessor());
        processors.add(new SecondProcessor());
        processors.add(new ThirdProcessor());
        return processors;
    }

}
