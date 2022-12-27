package com.vission.behavioral.chainOfResponsibility.fluent;

import com.vission.behavioral.chainOfResponsibility.fluent.context.ProcessorContext;
import com.vission.behavioral.chainOfResponsibility.fluent.strategy.Strategy;

/**
 * 只是个流程启动器
 */
public interface ProcessorExecute<T extends ProcessorContext, S extends Strategy<T>> {

    T execute(T context, S strategy);
}
