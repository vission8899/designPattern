package com.vission.behavioral.chainOfResponsibility.fluent;

import com.vission.behavioral.chainOfResponsibility.fluent.context.ProcessorContext;
import com.vission.behavioral.chainOfResponsibility.fluent.handle.Processor;
import com.vission.behavioral.chainOfResponsibility.fluent.strategy.Strategy;

/**
 * 只是个流程启动器
 */
public class ProcessorExecute {

    public Object execute(ProcessorContext context, Strategy strategy) {
        for (Processor processor : strategy.buildProcessor()) {
            context = processor.handel(context);
        }
        return context.getContext();
    }
}
