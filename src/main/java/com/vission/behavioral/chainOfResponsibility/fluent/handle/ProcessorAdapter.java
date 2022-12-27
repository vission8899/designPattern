package com.vission.behavioral.chainOfResponsibility.fluent.handle;

import com.vission.behavioral.chainOfResponsibility.fluent.context.ProcessorContext;

public abstract class ProcessorAdapter<T extends ProcessorContext> implements Processor<T> {

    @Override
    public T handel(T context) {
        throw new UnsupportedOperationException("未实现操作");
    }

    @Override
    public void handel() {
        throw new UnsupportedOperationException("未实现操作作");
    }

}
