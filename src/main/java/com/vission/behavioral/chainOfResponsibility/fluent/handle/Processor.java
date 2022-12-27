package com.vission.behavioral.chainOfResponsibility.fluent.handle;

import com.vission.behavioral.chainOfResponsibility.fluent.context.ProcessorContext;

/**
 * 责任链处理器
 *
 * @author vission
 */
public interface Processor<T extends ProcessorContext> {

    T handel(T context);

    void handel();

}
