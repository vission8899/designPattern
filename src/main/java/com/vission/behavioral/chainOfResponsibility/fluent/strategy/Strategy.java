package com.vission.behavioral.chainOfResponsibility.fluent.strategy;

import com.vission.behavioral.chainOfResponsibility.fluent.context.ProcessorContext;
import com.vission.behavioral.chainOfResponsibility.fluent.handle.Processor;
import java.util.LinkedList;

/**
 * 策略
 */
public abstract class Strategy<T extends ProcessorContext> {


    final LinkedList<Processor<T>> processors = new LinkedList<>();

    public abstract LinkedList<Processor<T>> buildProcessor();

}
