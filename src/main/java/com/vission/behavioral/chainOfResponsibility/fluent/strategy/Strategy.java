package com.vission.behavioral.chainOfResponsibility.fluent.strategy;

import com.vission.behavioral.chainOfResponsibility.fluent.handle.Processor;
import java.util.LinkedList;

/**
 * 策略
 */
public abstract class Strategy {


    final LinkedList<Processor> processors = new LinkedList<>();

    public abstract LinkedList<Processor> buildProcessor();

}
