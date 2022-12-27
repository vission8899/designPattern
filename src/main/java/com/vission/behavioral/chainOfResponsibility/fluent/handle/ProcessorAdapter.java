package com.vission.behavioral.chainOfResponsibility.fluent.handle;

import com.vission.behavioral.chainOfResponsibility.fluent.context.ProcessorContext;

public abstract class ProcessorAdapter implements Processor {

    @Override
    public ProcessorContext handel(ProcessorContext context) {
        throw new UnsupportedOperationException("未实现操作");
    }

    @Override
    public ProcessorContext handel() {
        throw new UnsupportedOperationException("未实现操作作");
    }

}
