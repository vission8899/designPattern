package com.vission.behavioral.chainOfResponsibility.fluent.context;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * 责任链上下文
 *
 * @author vission
 */

@Getter
@Builder
@ToString
public class FilterProcessorContext extends ProcessorContext {

    private String commit;
}
