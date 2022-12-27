package com.vission.behavioral.chainOfResponsibility.fluent.context;

import lombok.Builder;
import lombok.Getter;

/**
 * 责任链上下文
 *
 * @author vission
 */

@Getter
@Builder
public class ProcessorContext {

    private Object context;
}
