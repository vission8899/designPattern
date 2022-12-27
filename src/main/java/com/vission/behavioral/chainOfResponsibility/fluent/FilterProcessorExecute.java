package com.vission.behavioral.chainOfResponsibility.fluent;

import com.vission.behavioral.chainOfResponsibility.fluent.context.FilterProcessorContext;
import com.vission.behavioral.chainOfResponsibility.fluent.handle.Processor;
import com.vission.behavioral.chainOfResponsibility.fluent.strategy.FilterOrderStrategy;

/**
 * 只是个流程启动器
 */
public class FilterProcessorExecute implements ProcessorExecute<FilterProcessorContext, FilterOrderStrategy> {

    @Override
    public FilterProcessorContext execute(FilterProcessorContext context, FilterOrderStrategy strategy) {
        for (Processor<FilterProcessorContext> processor : strategy.buildProcessor()) {
            context = processor.handel(context);
        }
        return context;
    }
}
