package com.vission.behavioral.chainOfResponsibility.fluent.handle;

import com.vission.behavioral.chainOfResponsibility.fluent.context.ProcessorContext;

/**
 * 责任链处理器
 *
 * @author vission
 */
public interface Processor {

    ProcessorContext handel(ProcessorContext context);

    ProcessorContext handel();

}
